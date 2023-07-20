import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class318 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public AbstractArchive field3514;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1260242075
	)
	public int field3507;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1235114521
	)
	public int field3509;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1673909135
	)
	public int field3510;
	@ObfuscatedName("as")
	public float field3511;
	@ObfuscatedName("aj")
	public boolean field3512;
	@ObfuscatedName("ag")
	public boolean field3513;
	@ObfuscatedName("az")
	public boolean field3508;
	@ObfuscatedName("av")
	public boolean field3515;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	public MidiPcmStream field3516;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	public SoundCache field3517;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public MusicTrack field3518;

	@ObfuscatedSignature(
		descriptor = "(Lnd;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public class318(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.field3507 = -1;
		this.field3509 = -1;
		this.field3510 = 0;
		this.field3511 = 0.0F;
		this.field3512 = false;
		this.field3515 = false;
		this.field3507 = var1.getGroupId(var2);
		this.field3509 = var1.getFileId(this.field3507, var3);
		this.method6067(var1, this.field3507, this.field3509, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lnd;IIIZ)V"
	)
	public class318(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3507 = -1;
		this.field3509 = -1;
		this.field3510 = 0;
		this.field3511 = 0.0F;
		this.field3512 = false;
		this.field3515 = false;
		this.method6067(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IIIZB)V",
		garbageValue = "10"
	)
	void method6067(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3514 = var1;
		this.field3507 = var2;
		this.field3509 = var3;
		this.field3510 = var4;
		this.field3512 = var5;
	}
}
