package designpat.websearch;

/**
 * Watches the search queries
 */
public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;


        // friend filter
        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("Oh yes! " + query);
            }
        }, new WebSearchModel.QueryFilter() {
            @Override
            public boolean isFiltered(String query){
                return !query.toLowerCase().contains("friend");
            }
        });

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("So long....! " + query);
            }
        }, new WebSearchModel.QueryFilter() {
            @Override
            public boolean isFiltered(String query){
                return query.length() <= 60;
            }
        });
    }
}
