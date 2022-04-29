package designpat.websearch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Perform "web search" (from a file), notify the interested observers of each
 * query.
 */
public class WebSearchModel {
    private final File sourceFile;
    private final List<QueryFilterObserver> observer_filer_objects = new ArrayList<>();


    // class, whose object will store QueryFilter and QueryObserver, so we can store them together
    private class QueryFilterObserver{
        QueryFilter filter;
        QueryObserver observer;
        
        public QueryFilterObserver(QueryFilter filter, QueryObserver observer){
            this.filter = filter;
            this.observer = observer;
        }
        public QueryFilter getFilter(){
            return this.filter;
        }
        public QueryObserver getObserver(){
            return this.observer;
        }

    }

    // interface for custom query filter
    public interface QueryFilter {
        public boolean isFiltered(String query);
        
    }


    public interface QueryObserver {
        void onQuery(String query);
    }

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        // Source:
        // https://stackoverflow.com/questions/5868369/how-can-i-read-a-large-text-file-line-by-line-using-java
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                notifyAllObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // add QueryObserver and its correspondiong filter
    public void addQueryObserver(QueryObserver queryObserver, QueryFilter filter) {
        
        observer_filer_objects.add(new QueryFilterObserver(filter, queryObserver));
    }

    private void notifyAllObservers(String line) {
        for (QueryFilterObserver of_obj : observer_filer_objects) {
            if(!of_obj.getFilter().isFiltered(line)){
                of_obj.getObserver().onQuery(line);
            }
        }
    }
}
