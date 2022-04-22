import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	}

	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"-2044012999")

	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = UserComparator6.method2643(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return (Varps.Varps_main[var2] >> var3) & var5;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(CLlo;I)I", garbageValue = 
	"522647287")

	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if ((var0 == 241) && (var1 == Language.Language_ES)) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-4")

	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) {
			if (KeyHandler.field138 == KeyHandler.field141) {
				return false;
			} else {
				GameEngine.field218 = KeyHandler.field136[KeyHandler.field141];
				ItemComposition.field2121 = KeyHandler.field135[KeyHandler.field141];
				KeyHandler.field141 = (KeyHandler.field141 + 1) & 127;
				return true;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)Lbb;", garbageValue = 
	"-771048331")

	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class305.getNextWorldListWorld();
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1734362021")

	static final void method2050() {
		Client.field702 = Client.cycleCntr;
		Interpreter.ClanChat_inClanChat = true;
	}
}