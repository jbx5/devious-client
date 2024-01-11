import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("am")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1483704105
	)
	@Export("Messages_count")
	static int Messages_count;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1347462958"
	)
	public static final boolean method2837(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (WorldMapIcon_0.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class509.field5074;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class509.field5076;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1250012045"
	)
	static final void method2849() {
		if (Client.logoutTimer > 0) {
			class189.logOut();
		} else {
			Client.timer.method8040();
			class131.updateGameState(40);
			PlayerType.field4298 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	static final void method2850() {
		Client.field706 = Client.cycleCntr;
		VarpDefinition.field1832 = true;
	}
}
