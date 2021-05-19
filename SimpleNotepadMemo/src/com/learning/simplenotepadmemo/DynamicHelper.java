package com.learning.simplenotepadmemo;

public class DynamicHelper {

    private ProcessChoiceBase[] handlers;
    private String filePath;

    public DynamicHelper() {}

    public DynamicHelper(ProcessChoiceBase[] handlers, String filePath) {
        this.handlers = handlers;
        this.filePath = filePath;
    }

    public void process(String userInput) {
        String choice = userInput.split(" ")[0];

        ProcessChoiceBase theHandler = null;
        for(ProcessChoiceBase handler : handlers) {
            if(choice.equalsIgnoreCase(handler.getKeyword())) {
                theHandler = handler;
                break;
            }
        }
        theHandler.process(filePath);
    }

}
