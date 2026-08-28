class BrowserHistory {
    String[] History;
        int current;
        int last;


         public BrowserHistory(String homepage) {
         History=new String[1000];
current=0;
last=0;
History[current]=homepage;
                                                            
}

public void visit(String url) {

current++;
History[current]=url;
last=  current;


}

public String back(int steps) {
current=current-steps;
if(current<0){
current=0;
}
return History[current];
}

public String forward(int steps) {
current=current +steps;
if(current>last){
current=last;
}
return History[current];

}
}


