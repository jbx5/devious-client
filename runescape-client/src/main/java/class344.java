import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public class class344 {
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 918016623
	)
	static int field3667;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	UrlRequest field3669;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	SpritePixels field3670;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;)V"
	)
	class344(String var1, UrlRequester var2) {
		try {
			this.field3669 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3669 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lel;)V"
	)
	class344(UrlRequest var1) {
		this.field3669 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lvg;",
		garbageValue = "-20"
	)
	SpritePixels method6316() {
		if (this.field3670 == null && this.field3669 != null && this.field3669.isDone()) {
			if (this.field3669.getResponse() != null) {
				this.field3670 = GrandExchangeOfferUnitPriceComparator.readSpritePixelsFromBytes(this.field3669.getResponse());
			}

			this.field3669 = null;
		}

		return this.field3670;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "126"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-52"
	)
	static void method6318(int var0, int var1) {
		MenuAction var2 = Message.tempMenuAction;
		if (var2 != null) {
			CollisionMap.menuAction(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.itemId, var2.action, var2.target, var0, var1);
		}

		Message.tempMenuAction = null;
	}
}
