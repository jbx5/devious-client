import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public class class165 extends class143 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -8063989231043793109L
	)
	long field1780;
	@ObfuscatedName("ap")
	String field1776;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class165(class146 var1) {
		this.this$0 = var1;
		this.field1780 = -1L;
		this.field1776 = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1780 = var1.readLong();
		}

		this.field1776 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3347(this.field1780, this.field1776);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lky;",
		garbageValue = "-1613158274"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = class226.method4463(SequenceDefinition.SequenceDefinition_animationsArchive, class332.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1;
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-35"
	)
	static final void method3516(int var0, int var1, int var2, int var3) {
		class410.method7742();
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Ldf;II)V",
		garbageValue = "-434342130"
	)
	static final void method3517(Actor var0, int var1) {
		FriendSystem.worldToScreen(var0.x, var0.y, var1);
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1895306323"
	)
	static final void method3515(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class93.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1722840458"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (ClientPreferences.friendsChat != null) {
			PacketBufferNode var1 = class482.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
