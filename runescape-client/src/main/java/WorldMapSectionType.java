import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lhs;")

	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(2, ((byte) (0))),
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lhs;")

	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(3, ((byte) (1))),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lhs;")

	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, ((byte) (2))),
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lhs;")

	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, ((byte) (3)));

	@ObfuscatedName("su")
	@ObfuscatedGetter(intValue = 
	703478945)

	static int field2778;
	@ObfuscatedName("x")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("fn")
	@ObfuscatedGetter(intValue = 
	-854711519)

	static int field2768;
	@ObfuscatedName("hw")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	263983215)

	@Export("type")
	final int type;
	@ObfuscatedName("n")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"15")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)[Lhs;", garbageValue = 
	"330222458")

	static WorldMapSectionType[] method4949() {
		return new WorldMapSectionType[]{ WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE0 };
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"334656571")

	static int method4942(int var0) {
		Message var1 = ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message) (var1.nextDual)).count;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;I)I", garbageValue = 
	"100950073")

	static int method4952(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var0.method5666(var1);
			return 1;
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1416407373")

	static final void method4945() {
		if (Client.field721 != class160.Client_plane) {
			Client.field721 = class160.Client_plane;
			Tile.method3991(class160.Client_plane);
		}

	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(descriptor = 
	"(Lco;I)V", garbageValue = 
	"2020295686")

	static final void method4950(Actor var0) {
		var0.isWalking = false;
		SequenceDefinition var1;
		int var2;
		if (var0.movementSequence != (-1)) {
			var1 = ItemContainer.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null) {
				if ((!var1.isCachedModelIdSet()) && (var1.frameIds != null)) {
					++var0.movementFrameCycle;
					if ((var0.movementFrame < var1.frameIds.length) && (var0.movementFrameCycle > var1.frameLengths[var0.movementFrame])) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						class152.method3102(var1, var0.movementFrame, var0.x, var0.y);
					}

					if (var0.movementFrame >= var1.frameIds.length) {
						var0.movementFrameCycle = 0;
						var0.movementFrame = 0;
						class152.method3102(var1, var0.movementFrame, var0.x, var0.y);
					}
				} else if (var1.isCachedModelIdSet()) {
					++var0.movementFrame;
					var2 = var1.method3827();
					if (var0.movementFrame < var2) {
						class241.method5002(var1, var0.movementFrame, var0.x, var0.y);
					} else {
						var0.movementFrameCycle = 0;
						var0.movementFrame = 0;
						class241.method5002(var1, var0.movementFrame, var0.x, var0.y);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		if ((var0.spotAnimation != (-1)) && (Client.cycle >= var0.field1173)) {
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0;
			}

			int var4 = class6.SpotAnimationDefinition_get(var0.spotAnimation).sequence;
			if (var4 != (-1)) {
				SequenceDefinition var5 = ItemContainer.SequenceDefinition_get(var4);
				if ((var5 != null) && (var5.frameIds != null)) {
					++var0.spotAnimationFrameCycle;
					if ((var0.spotAnimationFrame < var5.frameIds.length) && (var0.spotAnimationFrameCycle > var5.frameLengths[var0.spotAnimationFrame])) {
						var0.spotAnimationFrameCycle = 1;
						++var0.spotAnimationFrame;
						class152.method3102(var5, var0.spotAnimationFrame, var0.x, var0.y);
					}

					if ((var0.spotAnimationFrame >= var5.frameIds.length) && ((var0.spotAnimationFrame < 0) || (var0.spotAnimationFrame >= var5.frameIds.length))) {
						var0.spotAnimation = -1;
					}
				} else if (var5.isCachedModelIdSet()) {
					++var0.spotAnimationFrame;
					int var3 = var5.method3827();
					if (var0.spotAnimationFrame < var3) {
						class241.method5002(var5, var0.spotAnimationFrame, var0.x, var0.y);
					} else if ((var0.spotAnimationFrame < 0) || (var0.spotAnimationFrame >= var3)) {
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1;
				}
			} else {
				var0.spotAnimation = -1;
			}
		}

		if ((var0.sequence != (-1)) && (var0.sequenceDelay <= 1)) {
			var1 = ItemContainer.SequenceDefinition_get(var0.sequence);
			if ((((var1.field2162 == 1) && (var0.field1134 > 0)) && (var0.field1179 <= Client.cycle)) && (var0.field1180 < Client.cycle)) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if ((var0.sequence != (-1)) && (var0.sequenceDelay == 0)) {
			var1 = ItemContainer.SequenceDefinition_get(var0.sequence);
			if (var1 != null) {
				if ((!var1.isCachedModelIdSet()) && (var1.frameIds != null)) {
					++var0.sequenceFrameCycle;
					if ((var0.sequenceFrame < var1.frameIds.length) && (var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame])) {
						var0.sequenceFrameCycle = 1;
						++var0.sequenceFrame;
						class152.method3102(var1, var0.sequenceFrame, var0.x, var0.y);
					}

					if (var0.sequenceFrame >= var1.frameIds.length) {
						var0.sequenceFrame -= var1.frameCount;
						++var0.field1169;
						if (var0.field1169 >= var1.field2169) {
							var0.sequence = -1;
						} else if ((var0.sequenceFrame >= 0) && (var0.sequenceFrame < var1.frameIds.length)) {
							class152.method3102(var1, var0.sequenceFrame, var0.x, var0.y);
						} else {
							var0.sequence = -1;
						}
					}

					var0.isWalking = var1.field2165;
				} else if (var1.isCachedModelIdSet()) {
					++var0.sequenceFrame;
					var2 = var1.method3801().method2771();
					if (var0.sequenceFrame < var2) {
						class241.method5002(var1, var0.sequenceFrame, var0.x, var0.y);
					} else {
						var0.sequenceFrame -= var1.frameCount;
						++var0.field1169;
						if (var0.field1169 >= var1.field2169) {
							var0.sequence = -1;
						} else if ((var0.sequenceFrame >= 0) && (var0.sequenceFrame < var2)) {
							class241.method5002(var1, var0.sequenceFrame, var0.x, var0.y);
						} else {
							var0.sequence = -1;
						}
					}
				} else {
					var0.sequence = -1;
				}
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(descriptor = 
	"(IIB)Lge;", garbageValue = 
	"1")

	static RouteStrategy method4954(int var0, int var1) {
		Client.field477.approxDestinationX = var0;
		Client.field477.approxDestinationY = var1;
		Client.field477.approxDestinationSizeX = 1;
		Client.field477.approxDestinationSizeY = 1;
		return Client.field477;
	}}