import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("kd")
	@ObfuscatedSignature(descriptor = 
	"Lky;")

	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	2120306507)

	@Export("world")
	public final int world;
	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = 
	4339962193294531453L)

	@Export("age")
	public final long age;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Llh;")

	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("f")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("b")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(descriptor = 
	"(Lpi;BI)V")

	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method6018(2);
		this.grandExchangeOffer.method6025(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"1933113552")

	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"-2144874603")

	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}
}