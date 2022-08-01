import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.runelite.rs.ScriptOpcodes;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
@ObfuscatedName("j")
public class class7 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lql;")
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;

	@ObfuscatedName("t")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("Widget_modelsArchive")
	public static AbstractArchive Widget_modelsArchive;

	@ObfuscatedName("hg")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;

	@ObfuscatedName("o")
	ExecutorService field23 = Executors.newSingleThreadExecutor();

	@ObfuscatedName("q")
	Future field29;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lqw;")
	final Buffer field24;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lu;")
	final class3 field25;

	@ObfuscatedSignature(descriptor = "(Lqw;Lu;)V")
	public class7(Buffer var1, class3 var2) {
		this.field24 = var1;
		this.field25 = var2;
		this.method38();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-16")
	public boolean method59() {
		return this.field29.isDone();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "464827960")
	public void method40() {
		this.field23.shutdown();
		this.field23 = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)Lqw;", garbageValue = "1906945635")
	public Buffer method41() {
		try {
			return ((Buffer) (this.field29.get()));
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1090779878")
	void method38() {
		this.field29 = this.field23.submit(new class1(this, this.field24, this.field25));
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)Lcy;", garbageValue = "-1669033629")
	static ClientPreferences method57() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();
		try {
			var0 = Actor.getPreferencesFile("", AbstractByteArrayCopier.field3293.name, false);
			byte[] var2 = new byte[((int) (var0.length()))];
			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}
			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}
		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}
		return var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "41")
	public static boolean method51(int var0) {
		return (var0 >> 29 & 1) != 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)[I", garbageValue = "-710386351")
	public static int[] method58() {
		int[] var0 = new int[KeyHandler.field131];
		for (int var1 = 0; var1 < KeyHandler.field131; ++var1) {
			var0[var1] = KeyHandler.field146[var1];
		}
		return var0;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "1175506688")
	static boolean method50(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var1) {
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var1)) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "-2145740720")
	static int method42(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			TaskHandler.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}
			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}
}