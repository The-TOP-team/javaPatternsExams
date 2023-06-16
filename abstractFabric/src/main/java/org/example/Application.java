package org.example;

public class Application {
    private GUIFactory guiFactory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory){
        this.guiFactory = guiFactory;
    }

    public void createUI(){
        button = guiFactory.createButton();;
        checkbox = guiFactory.createCheckbox();
    }

    public void renderUI(){
        button.render();;
        checkbox.render();
    }
}
