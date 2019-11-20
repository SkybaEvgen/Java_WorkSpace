package game;

import game.io.GameInput;
import game.io.GameOutput;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class GuessNumberGameTest {
    GameInput input = org.mockito.Mockito.mock(GameInput.class);
    GameOutput output = Mockito.mock(GameOutput.class);
    @Test
    public void testSucces(){

        //mock configuration
        when(input.getNextNumber()).thenReturn(3);

        //invoke test method
        GuessNumberGame game = new GuessNumberGame(input, output,
                3,3);
        game.play();

        //verify the result
        verify(output, times(2)).print(anyString());
    }
}
