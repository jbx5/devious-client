import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("el")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 422496079
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -735417501
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("au")
	boolean field1484;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 888815997
	)
	int field1489;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 749185065
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	ServerPacket field1492;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	ServerPacket field1488;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	ServerPacket field1493;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1484 = true;
		this.field1489 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "364411903"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "799617295"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset);
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index);
				this.bufferSize -= var1.index;
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lmq;I)V",
		garbageValue = "1810676977"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lsk;I)V",
		garbageValue = "702526911"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "455731516"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1804750267"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lsk;",
		garbageValue = "1302537932"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILsl;Lof;B)V",
		garbageValue = "1"
	)
	static void method3121(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		synchronized(ArchiveDiskActionHandler.field4494) {
			if (ArchiveDiskActionHandler.field4496 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4496 = 600;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-55"
	)
	static int method3110(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			class320.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = TaskHandler.widgetDefinition.method6841(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					if (var4 == 12) {
						var12.method7267();
						var12.method7268().method7189(new class110(var12));
						var12.method7268().method7000(new class111(var12));
					}

					var6.children[var11] = var12;
					if (var2) {
						Interpreter.scriptDotWidget = var12;
					} else {
						class464.scriptActiveWidget = var12;
					}

					SecureRandomCallable.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? Interpreter.scriptDotWidget : class464.scriptActiveWidget;
				Widget var10 = TaskHandler.widgetDefinition.method6841(var3.id);
				var10.children[var3.childIndex] = null;
				SecureRandomCallable.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = TaskHandler.widgetDefinition.method6841(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
				var3.children = null;
				SecureRandomCallable.invalidateWidget(var3);
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = TaskHandler.widgetDefinition.method6841(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							Interpreter.scriptDotWidget = var3;
						} else {
							class464.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Widget var5 = TaskHandler.widgetDefinition.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						Interpreter.scriptDotWidget = var5;
					} else {
						class464.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)Z",
		garbageValue = "-72720997"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = ClientPreferences.method2777(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var3 == var2) {
						return false;
					}
				} else if (var3 != var2) {
					return false;
				}
			}

			return true;
		}
	}
}
