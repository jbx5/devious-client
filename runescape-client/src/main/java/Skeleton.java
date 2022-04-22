import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	230523547)

	@Export("id")
	int id;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	90334317)

	@Export("count")
	int count;
	@ObfuscatedName("l")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("q")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lhk;")

	class231 field2590;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2590 = new class231(var3, var4);
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"21")

	public int method4720() {
		return this.count;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)Lhk;", garbageValue = 
	"1609725684")

	public class231 method4721() {
		return this.field2590;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)V", garbageValue = 
	"-1")

	static final void method4728(String var0) {
		PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2961, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"608778502")

	static int method4729(int var0, Script var1, boolean var2) {
		if (var0 == 7100) {
			++Interpreter.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7101) {
			class122.Interpreter_stringStackSize += 2;
			return 1;
		} else if (((((var0 != 7102) && (var0 != 7103)) && (var0 != 7104)) && (var0 != 7105)) && (var0 != 7109)) {
			if (var0 == 7106) {
				++Interpreter.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7107) {
				++Interpreter.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7108) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class21.method303()) ? 1 : 0;
				return 1;
			} else if (var0 == 7110) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
				return 1;
			} else if (var0 == 7120) {
				--Interpreter.Interpreter_intStackSize;
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
				return 1;
			} else if (var0 == 7121) {
				Interpreter.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
				return 1;
			} else if (var0 == 7122) {
				Interpreter.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			++Interpreter.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(descriptor = 
	"(Lcb;I)V", garbageValue = 
	"664542157")

	static final void method4730(Actor var0) {
		if (var0.field1175 != 0) {
			if (var0.targetIndex != (-1)) {
				Object var1 = null;
				if (var0.targetIndex < 32768) {
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var1 = Client.players[var0.targetIndex - 32768];
				}

				if (var1 != null) {
					int var2 = var0.x - ((Actor) (var1)).x;
					int var3 = var0.y - ((Actor) (var1)).y;
					if ((var2 != 0) || (var3 != 0)) {
						var0.orientation = ((int) (Math.atan2(((double) (var2)), ((double) (var3))) * 325.949)) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if ((var0.field1121 != (-1)) && ((var0.pathLength == 0) || (var0.field1179 > 0))) {
				var0.orientation = var0.field1121;
				var0.field1121 = -1;
			}

			int var4 = (var0.orientation - var0.rotation) & 2047;
			if ((var4 == 0) && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var4 != 0) {
				++var0.field1174;
				boolean var6;
				if (var4 > 1024) {
					var0.rotation -= (var0.field1144) ? var4 : (var0.field1175 * (-730517519)) * (-1419386607);
					var6 = true;
					if ((var4 < var0.field1175) || (var4 > (2048 - var0.field1175))) {
						var0.rotation = var0.orientation;
						var6 = false;
					}

					if (((!var0.field1144) && (var0.idleSequence == var0.movementSequence)) && ((var0.field1174 > 25) || var6)) {
						if (var0.turnLeftSequence != (-1)) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += (var0.field1144) ? var4 : ((-1419386607) * var0.field1175) * (-730517519);
					var6 = true;
					if ((var4 < var0.field1175) || (var4 > (2048 - var0.field1175))) {
						var0.rotation = var0.orientation;
						var6 = false;
					}

					if (((!var0.field1144) && (var0.movementSequence == var0.idleSequence)) && ((var0.field1174 > 25) || var6)) {
						if (var0.turnRightSequence != (-1)) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
				var0.field1144 = false;
			} else {
				var0.field1174 = 0;
			}

		}
	}
}