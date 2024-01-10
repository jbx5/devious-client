import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("LoginPacket")
public class LoginPacket implements class307 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final LoginPacket field3421;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	static final LoginPacket field3418;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final LoginPacket field3416;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final LoginPacket field3415;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final LoginPacket field3414;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	static final LoginPacket field3419;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lmh;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -188050641
	)
	@Export("id")
	public final int id;

	static {
		field3421 = new LoginPacket(14, 0);
		field3418 = new LoginPacket(15, 4);
		field3416 = new LoginPacket(16, -2);
		field3415 = new LoginPacket(18, -2);
		field3414 = new LoginPacket(19, -2);
		field3419 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = class345.method6685();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			LoginPacket_indexedValues[var0[var1].id] = var0[var1];
		}

	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method5996() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class93.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = class93.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2066265657"
	)
	static void method5995() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2077342774"
	)
	@Export("clear")
	static final void clear() {
		class182.field2007.clear();
		class184.field2023.clear();
		class173.field1915.clear();
		DbRowType.DBRowType_cache.clear();
		DbTableType.DBTableType_cache.clear();
		Login.method2167();
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		SecureRandomSSLSocket.method146();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		class172.field1913.clear();
		UrlRequester.method2901();
		class33.method495();
		class142.method3224();
		WorldMapDecoration.method5021();
		class185.field2026.clear();
		MouseHandler.method720();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		ParamComposition.ParamDefinition_cached.clear();
		PlayerComposition.method6414();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		ClanSettings.method3356();
		Friend.method8228();
		Language.Widget_cachedModels.method9202();
		class176.Widget_cachedFonts.method9202();
		class189.Widget_cachedSpriteMasks.clear();
		ClanSettings.method3409();
		VarcInt.VarcInt_cached.clear();
		class176.archive5.clear();
		class171.field1909.clear();
		class345.method6683();
		class30.method453();
		class149.method3292();
		class195.field2136.clear();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		LoginScreenAnimation.method2529();
		class380.widgetDefinition.method6349();
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		Client.field791.clearFiles();
		DirectByteArrayCopier.field3862.clearFiles();
		AABB.field2907.clearFiles();
		class189.archive10.clearFiles();
		WorldMapDecorationType.archive12.clearFiles();
		class36.archive2.clearFiles();
		AsyncHttpResponse.field80.clearFiles();
		class189.field1999.clearFiles();
		HitSplatDefinition.archive13.clearFiles();
		class173.archive4.clearFiles();
		class208.field2281.clearFiles();
		HttpContentType.field4844.clearFiles();
		WorldMapDecoration.field2627.clearFiles();
		class30.archive9.clearFiles();
		WorldMapSection0.archive6.clearFiles();
		MusicPatchNode.field3548.clearFiles();
		DynamicObject.field994.clearFiles();
		HttpRequestTask.archive8.clearFiles();
		class127.field1489.clearFiles();
		class314.field3428.clearFiles();
		class142.field1632.clearFiles();
		class130.field1521.clearFiles();
		PacketBufferNode.field3284.clearFiles();
	}
}
