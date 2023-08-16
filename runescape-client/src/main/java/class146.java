import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class146 {
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 6751235396742420937L
	)
	long field1690;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 128058307
	)
	public int field1682;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	IterableNodeDeque field1683;

	@ObfuscatedSignature(
		descriptor = "(Ltm;)V"
	)
	public class146(Buffer var1) {
		this.field1682 = -1;
		this.field1683 = new IterableNodeDeque();
		this.method3130(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-82"
	)
	void method3130(Buffer var1) {
		this.field1690 = var1.readLong();
		this.field1682 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class165(this);
			} else if (var2 == 1) {
				var3 = new class141(this);
			} else if (var2 == 13) {
				var3 = new class158(this);
			} else if (var2 == 4) {
				var3 = new class150(this);
			} else if (var2 == 6) {
				var3 = new class157(this);
			} else if (var2 == 5) {
				var3 = new class142(this);
			} else if (var2 == 2) {
				var3 = new class147(this);
			} else if (var2 == 7) {
				var3 = new class140(this);
			} else if (var2 == 14) {
				var3 = new class144(this);
			} else if (var2 == 8) {
				var3 = new class161(this);
			} else if (var2 == 9) {
				var3 = new class167(this);
			} else if (var2 == 10) {
				var3 = new class153(this);
			} else if (var2 == 11) {
				var3 = new class148(this);
			} else if (var2 == 12) {
				var3 = new class152(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class162(this);
			}

			((class143)var3).vmethod3337(var1);
			this.field1683.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;I)V",
		garbageValue = "192399010"
	)
	public void method3124(ClanSettings var1) {
		if (var1.field1728 == this.field1690 && this.field1682 == var1.field1745) {
			for (class143 var2 = (class143)this.field1683.last(); var2 != null; var2 = (class143)this.field1683.previous()) {
				var2.vmethod3339(var1);
			}

			++var1.field1745;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lly;",
		garbageValue = "-1"
	)
	public static PacketBufferNode method3131() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}
}
