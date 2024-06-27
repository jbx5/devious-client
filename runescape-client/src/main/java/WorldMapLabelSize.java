import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("wv")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("uw")
	@ObfuscatedGetter(
		intValue = 967349357
	)
	static int field2541;
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = -407252155
	)
	static int field2551;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 577264531
	)
	final int field2544;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1296221673
	)
	final int field2545;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 159073667
	)
	final int field2546;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2544 = var1;
		this.field2545 = var2;
		this.field2546 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-848100068"
	)
	boolean method4566(float var1) {
		return var1 >= (float)this.field2546;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "151913896"
	)
	static void method4567() {
		class146.otp.trim();
		if (class146.otp.length() != 6) {
			VerticalAlignment.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
		} else {
			class6.otpMedium = Integer.parseInt(class146.otp);
			class146.otp = "";
			class213.setAuthenticationScheme(true);
			VerticalAlignment.setLoginResponseString("", "Connecting to server...", "");
			ClanChannelMember.updateGameState(20);
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Lii;IIIZI)V",
		garbageValue = "-617654818"
	)
	static void method4571(SequenceDefinition var0, int var1, int var2, int var3, boolean var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.field2287 != null && var0.field2287.containsKey(var1)) {
				Sound var5 = (Sound)var0.field2287.get(var1);
				if (var5 != null) {
					int var6 = var5.field2148 & 31;
					if ((var6 <= 0 || class105.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var6 != 0 || class105.clientPreferences.getSoundEffectsVolume() != 0)) {
						class452.method8354(var5, var2, var3, var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "75"
	)
	static final int method4572(int var0) {
		return Math.abs(var0 - class337.cameraYaw) > 1024 ? var0 + 2048 * (var0 < class337.cameraYaw ? 1 : -1) : var0;
	}
}
