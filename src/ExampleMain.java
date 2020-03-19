

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class ExampleMain {

	public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException {

		MIDISequencePlayer player = new MIDISequencePlayer(5, 200);

		player.addNote(69, 100, 5, 5);
		player.addNote(71, 100, 15, 5);

		player.play();

	}

}
