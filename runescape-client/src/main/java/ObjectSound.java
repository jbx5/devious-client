import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field856;
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = -1235649789
	)
	static int field853;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1547628377
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1753203631
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -460372864
	)
	@Export("y")
	int y;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1813911287
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 749652693
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 835963461
	)
	int field845;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1143258933
	)
	int field846;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 591656919
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -502571839
	)
	int field849;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -139704035
	)
	int field850;
	@ObfuscatedName("ah")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -839235315
	)
	int field840;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1109055507"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field845 = var2.int7 * 128;
			this.field846 = var2.int8 * 16384;
			this.field849 = var2.int5;
			this.field850 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field845 = 0;
			this.field846 = 0;
			this.field849 = 0;
			this.field850 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			class238.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)Lnx;",
		garbageValue = "-397184281"
	)
	static Widget method1976(Widget var0) {
		int var2 = ClanChannel.getWidgetFlags(var0);
		int var1 = var2 >> 17 & 7;
		int var3 = var1;
		if (var1 == 0) {
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				var0 = ModeWhere.widgetDefinition.method6519(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
