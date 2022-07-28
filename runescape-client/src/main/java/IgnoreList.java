import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nv")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -676945199)
	static int field4293;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(descriptor = "(Lpa;)V")
	public IgnoreList(LoginType var1) {
		super(400);
		this.loginType = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)Lnd;", garbageValue = "12")
	@Export("newInstance")
	User newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)[Lnd;", garbageValue = "-1607059691")
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;IB)V", garbageValue = "-9")
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) {
				int var3 = var1.readUnsignedByte();
				boolean var4 = (var3 & 1) == 1;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				var1.readStringCp1252NullTerminated();
				if (var5 != null && var5.hasCleanName()) {
					Ignored var7 = ((Ignored) (this.getByCurrentUsername(var5)));
					if (var4) {
						Ignored var8 = ((Ignored) (this.getByCurrentUsername(var6)));
						if (var8 != null && var7 != var8) {
							if (var7 != null) {
								this.remove(var8);
							} else {
								var7 = var8;
							}
						}
					}
					if (var7 != null) {
						this.changeName(var7, var5, var6);
						continue;
					}
					if (this.getSize() < 400) {
						int var9 = this.getSize();
						var7 = ((Ignored) (this.addLast(var5, var6)));
						var7.id = var9;
					}
					continue;
				}
				throw new IllegalStateException();
			}
			return;
		} 
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1968612284")
	static void method6630() {
		class267.SpriteBuffer_xOffsets = null;
		class457.SpriteBuffer_yOffsets = null;
		class457.SpriteBuffer_spriteWidths = null;
		Decimator.SpriteBuffer_spriteHeights = null;
		GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette = null;
		DbTableType.SpriteBuffer_pixels = null;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(descriptor = "(Lku;I)Ljava/lang/String;", garbageValue = "2090269770")
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (BoundaryObject.Widget_unpackTargetMask(class67.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}