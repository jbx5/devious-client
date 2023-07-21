import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	public static final WorldMapCacheName field3050;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	public static final WorldMapCacheName field3046;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	public static final WorldMapCacheName field3051;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	static final WorldMapCacheName field3045;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	public static final WorldMapCacheName field3049;
	@ObfuscatedName("aj")
	@Export("name")
	public final String name;

	static {
		field3050 = new WorldMapCacheName("details");
		field3046 = new WorldMapCacheName("compositemap");
		field3051 = new WorldMapCacheName("compositetexture");
		field3045 = new WorldMapCacheName("area");
		field3049 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;Lnd;Ljava/util/ArrayList;B)Z",
		garbageValue = "1"
	)
	public static boolean method5575(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, ArrayList var3) {
		class306.field3393 = var0;
		class306.field3397 = var1;
		class306.field3401 = var2;
		class306.field3395 = var3;
		return true;
	}
}
