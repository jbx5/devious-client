import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class class274 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -465277371
	)
	int field3042;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -273358927
	)
	int field3043;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 146341175
	)
	int field3044;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -61048963
	)
	int field3045;

	public class274() {
		this.field3042 = 0;
		this.field3043 = 0;
		this.field3044 = 0;
		this.field3045 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "227427987"
	)
	public int method5765() {
		return this.field3043;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "93"
	)
	public int method5786() {
		return this.field3045;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-488158644"
	)
	public int method5767() {
		return this.field3044;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1805207659"
	)
	public int method5805() {
		return this.field3043 >> 7;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1382275455"
	)
	public int method5769() {
		return this.field3044 >> 7;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1852061365"
	)
	public int method5781() {
		return this.field3042;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lkt;I)V",
		garbageValue = "1443175737"
	)
	public void method5771(class274 var1) {
		this.field3042 = var1.field3042;
		this.field3043 = var1.field3043;
		this.field3045 = var1.field3045;
		this.field3044 = var1.field3044;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1268495425"
	)
	public void method5800(int var1, int var2) {
		this.field3043 = var1;
		this.field3044 = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1760661332"
	)
	public void method5790(int var1, int var2) {
		this.field3043 = Coord.method6853(var1) + 64;
		this.field3044 = Coord.method6853(var2) + 64;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "91"
	)
	public void method5773(int var1) {
		this.field3042 = var1 & 2047;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "442691643"
	)
	public void method5774(int var1) {
		this.field3045 = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "734022073"
	)
	public void method5775(int var1, int var2) {
		this.field3043 += var1;
		this.field3044 += var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1271978253"
	)
	public void method5782(int var1, int var2, int var3, int var4) {
		this.field3043 += var1;
		this.field3045 += var2;
		this.field3044 += var3;
		this.method5773(var4 + this.field3042);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;II)Lnp;",
		garbageValue = "1623881027"
	)
	static MusicPatch method5779(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}
}
