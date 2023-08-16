import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mw")
public class class326 {
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = -466560567
	)
	static int field3559;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	UrlRequest field3557;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	SpritePixels field3556;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lev;)V"
	)
	class326(String var1, UrlRequester var2) {
		try {
			this.field3557 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3557 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	class326(UrlRequest var1) {
		this.field3557 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "-688482237"
	)
	SpritePixels method6057() {
		if (this.field3556 == null && this.field3557 != null && this.field3557.isDone()) {
			if (this.field3557.getResponse() != null) {
				this.field3556 = WorldMapData_1.method5347(this.field3557.getResponse());
			}

			this.field3557 = null;
		}

		return this.field3556;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-856388391"
	)
	public static void method6058(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1268604308"
	)
	static int method6059(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.method6474() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
			return WorldMapDecoration.method5480(var3);
		} else if (var0 == 2709) {
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
			return class390.method7221(var3);
		} else {
			return 2;
		}
	}
}
