package states;

public class Canvas {
    private String currentTool;
    private String action;
    private ToolType currentTool;

    // If brush show "drawing square"
    // If eraser "deleted whatever"
    // If pencil

    public Canvas(String currentTool, String action){

        this.currentTool = currentTool ;
        this.action = action;
    }

    public String getCurrentTool() {
        return currentTool;
    }

    public void draw(){
        if (action.equals("brush")) {
            brush();
        }
        else if (action.equals("pencil")){
            pencil();
        }
        else {
            eraser();
        }
    }

    private void brush(){
        System.out.println("selected brush");
    }
    private void pencil(){
        System.out.println("selected pencil");
    }
    private void eraser(){
        System.out.println("selected eraser");
    }
}
