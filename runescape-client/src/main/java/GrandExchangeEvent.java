import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("lf")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1708213683)
	@Export("world")
	public final int world;

	@ObfuscatedName("q")
	@ObfuscatedGetter(longValue = 6797770262095984123L)
	@Export("age")
	public final long age;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;

	@ObfuscatedName("u")
	@Export("offerName")
	String offerName;

	@ObfuscatedName("c")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(descriptor = "(Lqw;BI)V")
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method6031(2);
		this.grandExchangeOffer.method6035(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1010679272")
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-365415776")
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}
}