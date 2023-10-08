import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2021112545
	)
	public int field4758;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 436635071
	)
	public int field4750;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1823051071
	)
	public int field4752;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -893063485
	)
	public int field4749;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 374676159
	)
	public int field4753;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 454929239
	)
	public int field4754;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2132493459
	)
	public int field4755;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1080946607
	)
	public int field4756;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -455480355
	)
	public int field4757;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -279292159
	)
	public int field4751;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1050136749
	)
	public int field4759;

	public GraphicsDefaults() {
		this.field4758 = -1;
		this.field4750 = -1;
		this.field4752 = -1;
		this.field4749 = -1;
		this.field4753 = -1;
		this.field4754 = -1;
		this.field4755 = -1;
		this.field4756 = -1;
		this.field4757 = -1;
		this.field4751 = -1;
		this.field4759 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;B)V",
		garbageValue = "5"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4747.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			switch(var4) {
			case 1:
				var3.readMedium();
				break;
			case 2:
				this.field4758 = var3.readNullableLargeSmart();
				this.field4750 = var3.readNullableLargeSmart();
				this.field4752 = var3.readNullableLargeSmart();
				this.field4749 = var3.readNullableLargeSmart();
				this.field4753 = var3.readNullableLargeSmart();
				this.field4754 = var3.readNullableLargeSmart();
				this.field4755 = var3.readNullableLargeSmart();
				this.field4756 = var3.readNullableLargeSmart();
				this.field4757 = var3.readNullableLargeSmart();
				this.field4751 = var3.readNullableLargeSmart();
				this.field4759 = var3.readNullableLargeSmart();
			}
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1779911274"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class91.clientPreferences.method2517() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
