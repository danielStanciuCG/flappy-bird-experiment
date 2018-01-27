package daniel.stanciu.flappybird.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class GameStateManager {
    private Stack<State> states;

    public GameStateManager() {
        states = new Stack<State>();
    }

    //Pushes a state onto the top oft he stack
    public void push(State state) {
        states.push(state);
    }

    //Removes the state at the top of the stack
    public void pop() {
        states.pop().dispose();
    }

    //Replaces the top state with another state
    public void set(State state) {
        states.pop().dispose();
        states.push(state);
    }

    //Look at the top state of the stack and change the delta time (changing time between renders)
    public void update(float dt) {
        states.peek().update(dt);
    }

    //Looks at the top state of the stack and renders thee sprite batch (container of all graphics)
    public void render(SpriteBatch sb) {
        states.peek().render(sb);
    }
}
