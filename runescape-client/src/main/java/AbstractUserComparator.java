import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("nn")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("ev")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive18")
	static Archive archive18;

	@ObfuscatedName("v")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;S)V", garbageValue = "3115")
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) {
			this.nextComparator = var1;
		} else if (this.nextComparator instanceof AbstractUserComparator) {
			((AbstractUserComparator) (this.nextComparator)).addComparator(var1);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Lne;Lne;I)I", garbageValue = "1110990243")
	@Export("compareUser")
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lpq;I)V", garbageValue = "-436787497")
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex();
		int var1 = Client.localPlayerIndex;
		Player var2 = class101.localPlayer = Client.players[var1] = new Player();
		var2.index = var1;
		int var3 = var0.readBits(30);
		byte var4 = ((byte) (var3 >> 28));
		int var5 = var3 >> 14 & 16383;
		int var6 = var3 & 16383;
		var2.pathX[0] = var5 - class28.baseX;
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
		var2.pathY[0] = var6 - WorldMapLabelSize.baseY;
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
		PacketWriter.Client_plane = var2.plane = var4;
		if (Players.field1307[var1] != null) {
			var2.read(Players.field1307[var1]);
		}
		Players.Players_count = 0;
		Players.Players_indices[++Players.Players_count - 1] = var1;
		Players.field1311[var1] = 0;
		Players.Players_emptyIdxCount = 0;
		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var1 != var7) {
				int var8 = var0.readBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597;
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
				Players.field1311[var7] = 0;
			}
		}
		var0.exportIndex();
	}
}