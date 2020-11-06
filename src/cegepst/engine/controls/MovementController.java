package cegepst.engine.controls;

import java.awt.event.KeyEvent;

public class MovementController extends Controller {

    private int upKey = KeyEvent.VK_UP;
    private int downKey = KeyEvent.VK_DOWN;
    private int rightKey = KeyEvent.VK_RIGHT;
    private int leftKey = KeyEvent.VK_LEFT;

    public MovementController() {
        int[] pressedKeys = {upKey, downKey, rightKey, leftKey};
        bindKeys(pressedKeys);
    }

    public boolean isLeftPressed() {
        return super.isKeyPressed(leftKey);
    }

    public boolean isRightPressed() {
        return super.isKeyPressed(rightKey);
    }

    public boolean isUpPressed() {
        return super.isKeyPressed(upKey);
    }

    public boolean isDownPressed() {
        return super.isKeyPressed(downKey);
    }

    public boolean isMoving() {
        return isDownPressed() || isLeftPressed()
                || isRightPressed() || isUpPressed();
    }

    public void setUpKey(int upKey) {
        super.removeKey(this.upKey);
        this.upKey = upKey;
        super.bindKey(upKey);
    }

    public void setDownKey(int downKey) {
        super.removeKey(this.downKey);
        this.downKey = downKey;
        super.bindKey(downKey);
    }

    public void setRightKey(int rightKey) {
        super.removeKey(this.rightKey);
        this.rightKey = rightKey;
        super.bindKey(rightKey);
    }

    public void setLeftKey(int leftKey) {
        super.removeKey(this.leftKey);
        this.leftKey = leftKey;
        super.bindKey(leftKey);
    }
}
