import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("ds")
public class class127 extends class128 {
	@ObfuscatedName("vo")
	@ObfuscatedGetter(intValue = -1062963955)
	@Export("foundItemIdCount")
	static int foundItemIdCount;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1763358293)
	int field1538;

	@ObfuscatedSignature(descriptor = "Lec;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lec;)V")
	class127(class131 var1) {
		this.this$0 = var1;
		this.field1538 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-423569520")
	void vmethod3155(Buffer var1) {
		this.field1538 = var1.readUnsignedShort();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lez;I)V", garbageValue = "-1755436064")
	void vmethod3154(ClanSettings var1) {
		var1.method2979(this.field1538);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1709801867")
	static void method2888() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(B)Lbk;", garbageValue = "118")
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return NPC.getNextWorldListWorld();
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "78")
	static final void method2887(int var0, int var1) {
		if (Client.hintArrowType == 2) {
			GrandExchangeOfferOwnWorldComparator.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - class300.baseX * 8 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - Message.baseY * 64 << 7), Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class92.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}
	}
}