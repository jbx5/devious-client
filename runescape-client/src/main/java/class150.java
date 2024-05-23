import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class150 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -8184252867772202709L
	)
	long field1710;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1680514671
	)
	public int field1706;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	IterableNodeDeque field1711;

	@ObfuscatedSignature(
		descriptor = "(Lua;)V"
	)
	public class150(Buffer var1) {
		this.field1706 = -1;
		this.field1711 = new IterableNodeDeque();
		this.method3252(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-1169519545"
	)
	void method3252(Buffer var1) {
		this.field1710 = var1.readLong();
		this.field1706 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class169(this);
			} else if (var2 == 1) {
				var3 = new LoginPacket(this);
			} else if (var2 == 13) {
				var3 = new class162(this);
			} else if (var2 == 4) {
				var3 = new class154(this);
			} else if (var2 == 6) {
				var3 = new class161(this);
			} else if (var2 == 5) {
				var3 = new class146(this);
			} else if (var2 == 2) {
				var3 = new class151(this);
			} else if (var2 == 7) {
				var3 = new class144(this);
			} else if (var2 == 14) {
				var3 = new class148(this);
			} else if (var2 == 8) {
				var3 = new class165(this);
			} else if (var2 == 9) {
				var3 = new class171(this);
			} else if (var2 == 10) {
				var3 = new class157(this);
			} else if (var2 == 11) {
				var3 = new class152(this);
			} else if (var2 == 12) {
				var3 = new class156(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class166(this);
			}

			((class147)var3).vmethod3486(var1);
			this.field1711.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgc;I)V",
		garbageValue = "143754529"
	)
	public void method3261(ClanSettings var1) {
		if (this.field1710 == var1.field1784 && this.field1706 == var1.field1763) {
			for (class147 var2 = (class147)this.field1711.last(); var2 != null; var2 = (class147)this.field1711.previous()) {
				var2.vmethod3490(var1);
			}

			++var1.field1763;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "15699"
	)
	static final boolean method3254() {
		return Client.isMenuOpen;
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1894426333"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = WorldMapElement.getPacketBufferNode(ClientPacket.field3347, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
