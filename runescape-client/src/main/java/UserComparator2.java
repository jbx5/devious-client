import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
@Implements("UserComparator2")
public class UserComparator2 implements Comparator {
	@ObfuscatedName("uj")
	@ObfuscatedSignature(descriptor = 
	"Lov;")

	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator2(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnc;Lnc;I)I", garbageValue = 
	"988233292")

	@Export("compare_bridged")
	int compare_bridged(User var1, User var2) {
		return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((User) (var1)), ((User) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZS)I", garbageValue = 
	"-23460")

	static int method8042(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return FontName.method7511(var0, var1, var2);
		} else if (var0 < 1100) {
			return class305.method5787(var0, var1, var2);
		} else if (var0 < 1200) {
			return class117.method2709(var0, var1, var2);
		} else if (var0 < 1300) {
			return WorldMapScaleHandler.method5134(var0, var1, var2);
		} else if (var0 < 1400) {
			return ItemLayer.method3896(var0, var1, var2);
		} else if (var0 < 1500) {
			return class193.method3879(var0, var1, var2);
		} else if (var0 < 1600) {
			return UserComparator10.method2614(var0, var1, var2);
		} else if (var0 < 1700) {
			return GameBuild.method5775(var0, var1, var2);
		} else if (var0 < 1800) {
			return GrandExchangeEvents.method5993(var0, var1, var2);
		} else if (var0 < 1900) {
			return class136.method2896(var0, var1, var2);
		} else if (var0 < 2000) {
			return SecureRandomCallable.method2064(var0, var1, var2);
		} else if (var0 < 2100) {
			return class305.method5787(var0, var1, var2);
		} else if (var0 < 2200) {
			return class117.method2709(var0, var1, var2);
		} else if (var0 < 2300) {
			return WorldMapScaleHandler.method5134(var0, var1, var2);
		} else if (var0 < 2400) {
			return ItemLayer.method3896(var0, var1, var2);
		} else if (var0 < 2500) {
			return class193.method3879(var0, var1, var2);
		} else if (var0 < 2600) {
			return SoundCache.method803(var0, var1, var2);
		} else if (var0 < 2700) {
			return Client.method1606(var0, var1, var2);
		} else if (var0 < 2800) {
			return class115.method2681(var0, var1, var2);
		} else if (var0 < 2900) {
			return class305.method5786(var0, var1, var2);
		} else if (var0 < 3000) {
			return SecureRandomCallable.method2064(var0, var1, var2);
		} else if (var0 < 3200) {
			return class17.method259(var0, var1, var2);
		} else if (var0 < 3300) {
			return DirectByteArrayCopier.method5540(var0, var1, var2);
		} else if (var0 < 3400) {
			return class119.method2741(var0, var1, var2);
		} else if (var0 < 3500) {
			return class14.method184(var0, var1, var2);
		} else if (var0 < 3600) {
			return FloorOverlayDefinition.method3773(var0, var1, var2);
		} else if (var0 < 3700) {
			return class271.method5256(var0, var1, var2);
		} else if (var0 < 3800) {
			return class132.method2861(var0, var1, var2);
		} else if (var0 < 3900) {
			return MusicPatchPcmStream.method5485(var0, var1, var2);
		} else if (var0 < 4000) {
			return Language.method6125(var0, var1, var2);
		} else if (var0 < 4100) {
			return class17.method280(var0, var1, var2);
		} else if (var0 < 4200) {
			return class19.method314(var0, var1, var2);
		} else if (var0 < 4300) {
			return UserComparator8.method2569(var0, var1, var2);
		} else if (var0 < 5100) {
			return DevicePcmPlayerProvider.method384(var0, var1, var2);
		} else if (var0 < 5400) {
			return ClanChannel.method3078(var0, var1, var2);
		} else if (var0 < 5600) {
			return WorldMapIcon_1.method4559(var0, var1, var2);
		} else if (var0 < 5700) {
			return JagexCache.method3227(var0, var1, var2);
		} else if (var0 < 6300) {
			return UserComparator4.method2567(var0, var1, var2);
		} else if (var0 < 6600) {
			return HitSplatDefinition.method3642(var0, var1, var2);
		} else if (var0 < 6700) {
			return class149.method3081(var0, var1, var2);
		} else if (var0 < 6800) {
			return Language.method6121(var0, var1, var2);
		} else if (var0 < 6900) {
			return MilliClock.method3293(var0, var1, var2);
		} else if (var0 < 7000) {
			return Language.method6132(var0, var1, var2);
		} else if (var0 < 7100) {
			return UserComparator5.method2595(var0, var1, var2);
		} else if (var0 < 7200) {
			return class239.method4999(var0, var1, var2);
		} else if (var0 < 7300) {
			return PcmPlayer.method770(var0, var1, var2);
		} else {
			return var0 < 7500 ? ModeWhere.method6144(var0, var1, var2) : 2;
		}
	}
}