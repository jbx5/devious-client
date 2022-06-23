import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@Deprecated
@ObfuscatedName("lj")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -719999359)
	@Export("world")
	public final int world;

	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = 2849565838648166291L)
	@Export("age")
	public final long age;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;

	@ObfuscatedName("f")
	@Export("offerName")
	String offerName;

	@ObfuscatedName("j")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(descriptor = "(Lqt;BI)V")
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method6007(2);
		this.grandExchangeOffer.method6005(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-143150705")
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "36")
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}
}