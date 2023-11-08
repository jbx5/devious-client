import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -1780121491
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = 1895489664
	)
	static int field456;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 640777695
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("ar")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("ao")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1468769999"
	)
	static final void method1213(String var0) {
		PacketBufferNode var1 = class113.getPacketBufferNode(ClientPacket.FRIEND_ADDUSER, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(ClanChannel.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ldp;I)V",
		garbageValue = "128237974"
	)
	static final void method1212(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = class36.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = class36.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = class36.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = class36.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) {
			int var6 = class36.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = class232.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1158 = var4;
		var0.field1157 = var5;
	}
}
