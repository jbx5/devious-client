import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("v")
	@Export("state")
	byte state;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	10431225)

	@Export("id")
	public int id;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	268603401)

	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-2119681887)

	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	151834997)

	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-92952021)

	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(descriptor = 
	"(Lpd;Z)V", garbageValue = 
	"0")

	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1572624507")

	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-2085742420")

	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-337380449")

	void method6050(int var1) {
		this.state &= -8;
		this.state = ((byte) (this.state | (var1 & 7)));
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1896957082")

	void method6053(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = ((byte) (this.state | 8));
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(Lbr;Lbr;IZI)I", garbageValue = 
	"1940653872")

	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == (-1)) {
					var4 = 2001;
				}

				if (var5 == (-1)) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1612() ? var1.method1612() ? 0 : 1 : var1.method1612() ? -1 : 0;
		} else if (var2 == 5) {
			return var0.method1628() ? var1.method1628() ? 0 : 1 : var1.method1628() ? -1 : 0;
		} else if (var2 == 6) {
			return var0.isPvp() ? var1.isPvp() ? 0 : 1 : var1.isPvp() ? -1 : 0;
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? var1.isMembersOnly() ? 0 : 1 : var1.isMembersOnly() ? -1 : 0;
		} else {
			return var0.id - var1.id;
		}
	}
}