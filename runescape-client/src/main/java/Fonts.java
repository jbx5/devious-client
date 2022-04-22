import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	623297429)

	static int field4517;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("i")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(descriptor = 
	"(Lln;Lln;)V")

	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([Low;I)Ljava/util/HashMap;", garbageValue = 
	"554923002")

	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap();
		FontName[] var3 = var1;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			FontName var5 = var3[var4];
			if (this.map.containsKey(var5)) {
				var2.put(var5, this.map.get(var5));
			} else {
				Font var6 = class431.method7594(this.spritesArchive, this.fontsArchive, var5.name, "");
				if (var6 != null) {
					this.map.put(var5, var6);
					var2.put(var5, var6);
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpz;B)V", garbageValue = 
	"0")

	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex();
		int var1 = Client.localPlayerIndex;
		Player var2 = GrandExchangeEvents.localPlayer = Client.players[var1] = new Player();
		var2.index = var1;
		int var3 = var0.readBits(30);
		byte var4 = ((byte) (var3 >> 28));
		int var5 = (var3 >> 14) & 16383;
		int var6 = var3 & 16383;
		var2.pathX[0] = var5 - GrandExchangeOfferOwnWorldComparator.baseX;
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
		var2.pathY[0] = var6 - VarcInt.baseY;
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
		class18.Client_plane = var2.plane = var4;
		if (Players.field1276[var1] != null) {
			var2.read(Players.field1276[var1]);
		}

		Players.Players_count = 0;
		Players.Players_indices[(++Players.Players_count) - 1] = var1;
		Players.field1283[var1] = 0;
		Players.Players_emptyIdxCount = 0;

		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var1 != var7) {
				int var8 = var0.readBits(18);
				int var9 = var8 >> 16;
				int var10 = (var8 >> 8) & 597;
				int var11 = var8 & 597;
				Players.Players_regions[var7] = ((var10 << 14) + var11) + (var9 << 28);
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[(++Players.Players_emptyIdxCount) - 1] = var7;
				Players.field1283[var7] = 0;
			}
		}

		var0.exportIndex();
	}
}