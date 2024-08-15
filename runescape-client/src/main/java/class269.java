import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ka")
public class class269 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class269 field2955;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class269 field2950;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class269 field2951;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class269 field2952;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class269 field2961;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class269 field2954;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class269 field2953;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lka;"
	)
	static final class269[] field2959;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	static SpritePixels[] field2960;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1280558081
	)
	final int field2956;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1722017029
	)
	final int field2957;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2009593297
	)
	final int field2958;

	static {
		field2955 = new class269(5, 8, 8);
		field2950 = new class269(4, 16, 16);
		field2951 = new class269(2, 32, 32);
		field2952 = new class269(6, 48, 48);
		field2961 = new class269(1, 64, 64);
		field2954 = new class269(0, 96, 96);
		field2953 = new class269(3, 128, 128);
		class269[] var0 = new class269[]{field2954, field2961, field2951, field2953, field2950, field2955, field2952};
		field2959 = var0;
		Arrays.sort(field2959, new class277());
	}

	class269(int var1, int var2, int var3) {
		this.field2956 = var1;
		this.field2957 = var2;
		this.field2958 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-65"
	)
	int method5420() {
		return this.field2958 * this.field2957;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ljf;",
		garbageValue = "929624091"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = GrandExchangeOfferTotalQuantityComparator.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-567997984"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class535.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "-691885667"
	)
	static int method5423(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
