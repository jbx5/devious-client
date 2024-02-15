import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class133 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1590;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1580;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1586;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1591;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1583;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	static final class133 field1584;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 242390253
	)
	static int field1589;
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2124289167
	)
	final int field1585;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1368643101
	)
	final int field1593;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2111787893
	)
	final int field1587;

	static {
		field1590 = new class133(0, 0, (String)null, 0);
		field1580 = new class133(1, 1, (String)null, 9);
		field1586 = new class133(2, 2, (String)null, 3);
		field1591 = new class133(3, 3, (String)null, 6);
		field1583 = new class133(4, 4, (String)null, 1);
		field1584 = new class133(5, 5, (String)null, 3);
	}

	class133(int var1, int var2, String var3, int var4) {
		this.field1585 = var1;
		this.field1593 = var2;
		this.field1587 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1593;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "91"
	)
	int method3111() {
		return this.field1587;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public static int method3115(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "-2"
	)
	public static void method3120(ArrayList var0, int var1, int var2, int var3, int var4) {
		class321.field3484.clear();
		class321.field3484.addAll(var0);
		ScriptFrame.method1158(var1, var2, var3, var4);
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	@Export("clear")
	static final void clear() {
		class183.field2007.clear();
		class185.field2023.clear();
		class160.method3424();
		KitDefinition.method3630();
		class168.method3505();
		class257.method5048();
		class132.method3109();
		AsyncRestClient.method165();
		FloorDecoration.method5268();
		class59.method1129();
		class173.field1913.clear();
		SequenceDefinition.method4104();
		ClientPacket.method6032();
		class151.method3279();
		class30.method420();
		ItemContainer.method2347();
		MusicPatchPcmStream.method6372();
		class190.method3773();
		ParamComposition.ParamDefinition_cached.clear();
		ModeWhere.method7376();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		StructComposition.StructDefinition_cached.clear();
		VarbitComposition.VarbitDefinition_cached.clear();
		if (EnumComposition.field1931 != null) {
			EnumComposition.field1931.method9275();
		}

		if (ApproximateRouteStrategy.field488 != null) {
			ApproximateRouteStrategy.field488.method9275();
		}

		class31.method430();
		class192.field2022.clear();
		VarcInt.VarcInt_cached.clear();
		class177.field1864.clear();
		class172.field1842.clear();
		class175.field1851.clear();
		class198.field1909.clear();
		HorizontalAlignment.method3694();
		class196.field2136.clear();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3674.clearFiles();
		PlayerComposition.field3661 = 0;
		if (ArchiveLoader.widgetDefinition != null) {
			ArchiveLoader.widgetDefinition.method6436();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		Script.Script_cached.clear();
		Client.field821.clearFiles();
		if (class154.field1724 != null) {
			class154.field1724.clearFiles();
		}

		if (Client.field556 != null) {
			Client.field556.clearFiles();
		}

		if (ScriptFrame.archive10 != null) {
			ScriptFrame.archive10.clearFiles();
		}

		if (WorldMapSectionType.archive12 != null) {
			WorldMapSectionType.archive12.clearFiles();
		}

		if (HttpRequestTask.archive2 != null) {
			HttpRequestTask.archive2.clearFiles();
		}

		if (class150.field1703 != null) {
			class150.field1703.clearFiles();
		}

		if (SecureRandomSSLSocket.field52 != null) {
			SecureRandomSSLSocket.field52.clearFiles();
		}

		if (KeyHandler.archive13 != null) {
			KeyHandler.archive13.clearFiles();
		}

		if (ScriptFrame.archive4 != null) {
			ScriptFrame.archive4.clearFiles();
		}

		if (MouseHandler.field239 != null) {
			MouseHandler.field239.clearFiles();
		}

		if (class376.field4387 != null) {
			class376.field4387.clearFiles();
		}

		if (WorldMapSectionType.field2612 != null) {
			WorldMapSectionType.field2612.clearFiles();
		}

		if (JagexCache.archive9 != null) {
			JagexCache.archive9.clearFiles();
		}

		if (Renderable.archive6 != null) {
			Renderable.archive6.clearFiles();
		}

		if (class198.field2070 != null) {
			class198.field2070.clearFiles();
		}

		if (class86.field1084 != null) {
			class86.field1084.clearFiles();
		}

		if (class311.archive8 != null) {
			class311.archive8.clearFiles();
		}

		if (Varcs.field1417 != null) {
			Varcs.field1417.clearFiles();
		}

		if (class391.field4483 != null) {
			class391.field4483.clearFiles();
		}

		if (class362.field3958 != null) {
			class362.field3958.clearFiles();
		}

		if (SpotAnimationDefinition.field2045 != null) {
			SpotAnimationDefinition.field2045.clearFiles();
		}

		if (PlayerCompositionColorTextureOverride.field1832 != null) {
			PlayerCompositionColorTextureOverride.field1832.clearFiles();
		}

	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1122616449"
	)
	static final void method3113(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3481()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = ViewportMouse.getPacketBufferNode(ClientPacket.field3255, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + class145.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
