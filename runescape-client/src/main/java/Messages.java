import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("v")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lpt;")

	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lmr;")

	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1887673835)

	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = 
	"Lkt;")

	static StudioGame field1305;
	static 
	{
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"-2020687752")

	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = "";
		Login.Login_response2 = "Enter your username/email & password.";
		Login.Login_response3 = "";
		Ignored.method6828(2);
		if (var0) {
			Login.Login_password = "";
		}

		Players.method2421();
		class12.method157();
	}
}