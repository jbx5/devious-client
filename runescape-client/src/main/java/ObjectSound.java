import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1722320907
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 351317541
	)
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2006300032
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2136873344
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 863217715
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2039856379
	)
	int field872;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -546088405
	)
	int field864;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2049420587
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1620105503
	)
	int field875;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 555083037
	)
	int field877;
	@ObfuscatedName("aj")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 126439761
	)
	int field878;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field872 = var2.int7 * 128;
			this.field864 = var2.int8 * 128;
			this.field875 = var2.int5;
			this.field877 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field872 = 0;
			this.field864 = 0;
			this.field875 = 0;
			this.field877 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			SceneTilePaint.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "78"
	)
	static final boolean method1947(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (BoundaryObject.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class512.field5095;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class512.field5096;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhj;",
		garbageValue = "-688519849"
	)
	static HorizontalAlignment[] method1953() {
		return new HorizontalAlignment[]{HorizontalAlignment.field1951, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1950};
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)Z",
		garbageValue = "20"
	)
	static final boolean method1954(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}
}
