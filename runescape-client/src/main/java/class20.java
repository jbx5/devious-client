import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class20 implements Callable {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	public static AbstractArchive field101;
	@ObfuscatedName("r")
	public static short[][] field102;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lk;")

	final class10 field100;

	@ObfuscatedSignature(descriptor = 
	"Lp;")

	final class14 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lp;Lk;)V")

	class20(class14 var1, class10 var2) {
		this.this$0 = var1;
		this.field100 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field100.method105()) {
				GrandExchangeOfferTotalQuantityComparator.method6007(10L);
			} 
		} catch (IOException var2) {
			return new class21("Error servicing REST query: " + var2.getMessage());
		}

		return this.field100.method91();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/CharSequence;I)Z", garbageValue = 
	"-28287593")

	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return ClanChannelMember.method2850(var0, 10, true);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"441133121")

	static void method327() {
		if (Login.clearLoginScreen) {
			AbstractByteArrayCopier.titleboxSprite = null;
			class137.titlebuttonSprite = null;
			class355.runesSprite = null;
			Login.leftTitleSprite = null;
			class162.rightTitleSprite = null;
			HorizontalAlignment.logoSprite = null;
			class114.title_muteSprite = null;
			class160.options_buttons_0Sprite = null;
			Skeleton.options_buttons_2Sprite = null;
			class128.worldSelectBackSprites = null;
			class162.worldSelectFlagSprites = null;
			Client.worldSelectArrows = null;
			class29.worldSelectStars = null;
			class19.field96 = null;
			Login.loginScreenRunesAnimation.method2230();
			class273.musicPlayerStatus = 1;
			class147.musicTrackArchive = null;
			ArchiveLoader.musicTrackGroupId = -1;
			class273.musicTrackFileId = -1;
			DevicePcmPlayerProvider.musicTrackVolume = 0;
			class260.musicTrackBoolean = false;
			class273.pcmSampleLength = 2;
			NPC.method2366(true);
			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"19")

	static void method326() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = ((Message) (var0.next()));
			var1.clearIsFromFriend();
		} 

	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIIIB)V", garbageValue = 
	"-43")

	static final void method324(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334;
		if (var8 < 0) {
			var8 = 0;
		} else if (var8 > 100) {
			var8 = 100;
		}

		int var9 = (((Client.zoomWidth - Client.zoomHeight) * var8) / 100) + Client.zoomHeight;
		int var7 = (var5 * var9) / 256;
		var8 = (2048 - var3) & 2047;
		var9 = (2048 - var4) & 2047;
		int var10 = 0;
		int var11 = 0;
		int var12 = var7;
		int var13;
		int var14;
		int var15;
		if (var8 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var8];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var15 = ((var14 * var11) - (var13 * var7)) >> 16;
			var12 = ((var7 * var14) + (var13 * var11)) >> 16;
			var11 = var15;
		}

		if (var9 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var9];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9];
			var15 = ((var14 * var10) + (var12 * var13)) >> 16;
			var12 = ((var12 * var14) - (var13 * var10)) >> 16;
			var10 = var15;
		}

		if (Client.isCameraLocked) {
			class175.field1883 = var0 - var10;
			ReflectionCheck.field250 = var1 - var11;
			ModeWhere.field4080 = var2 - var12;
			WorldMapRegion.field2706 = var3;
			class457.field4747 = var4;
		} else {
			EnumComposition.cameraX = var0 - var10;
			FriendSystem.cameraY = var1 - var11;
			CollisionMap.cameraZ = var2 - var12;
			Language.cameraPitch = var3;
			MusicPatchNode2.cameraYaw = var4;
		}

		if ((((Client.oculusOrbState == 1) && (Client.staffModLevel >= 2)) && ((Client.cycle % 50) == 0)) && (((Messages.oculusOrbFocalPointX >> 7) != (class19.localPlayer.x >> 7)) || ((class115.oculusOrbFocalPointY >> 7) != (class19.localPlayer.y >> 7)))) {
			var13 = class19.localPlayer.plane;
			var14 = (Messages.oculusOrbFocalPointX >> 7) + ApproximateRouteStrategy.baseX;
			var15 = (class115.oculusOrbFocalPointY >> 7) + class250.baseY;
			class392.method7191(var14, var15, var13, true);
		}

	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(descriptor = 
	"(Lcy;ZI)V", garbageValue = 
	"-1005084582")

	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = ((int) (var0.key));
		var0.remove();
		if (var1) {
			WorldMapID.method5000(var2);
		}

		class19.method318(var2);
		Widget var4 = HorizontalAlignment.getWidget(var3);
		if (var4 != null) {
			class290.invalidateWidget(var4);
		}

		if (Client.rootInterface != (-1)) {
			MouseHandler.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}