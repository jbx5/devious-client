import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = -896049715
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	static class528 field2639;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = -1619357703
	)
	static int field2641;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1506494255
	)
	int field2656;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -118489229
	)
	int field2638;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1838880061
	)
	int field2655;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 100104241
	)
	int field2640;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	FloorDecoration field2645;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	ItemLayer field2646;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 8092243
	)
	int field2647;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lkf;"
	)
	GameObject[] field2637;
	@ObfuscatedName("aq")
	int[] field2649;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1261156353
	)
	int field2650;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 225429201
	)
	int field2651;
	@ObfuscatedName("ax")
	boolean field2662;
	@ObfuscatedName("ay")
	boolean field2653;
	@ObfuscatedName("au")
	boolean field2644;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1960205435
	)
	int field2648;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 176877587
	)
	int field2660;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1016934781
	)
	int field2657;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2034123681
	)
	int field2658;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	Tile field2659;

	Tile(int var1, int var2, int var3) {
		this.field2637 = new GameObject[5];
		this.field2649 = new int[5];
		this.field2650 = 0;
		this.field2640 = this.field2656 = var1;
		this.field2638 = var2;
		this.field2655 = var3;
	}
}
