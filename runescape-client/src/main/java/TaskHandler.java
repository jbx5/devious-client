import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.net.Socket;
import net.runelite.rs.ScriptOpcodes;
import java.net.InetAddress;
import java.io.DataInputStream;
import net.runelite.mapping.Export;
@ObfuscatedName("ff")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("o")
	@Export("javaVendor")
	public static String javaVendor;

	@ObfuscatedName("q")
	@Export("javaVersion")
	public static String javaVersion;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1971059873)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;

	@ObfuscatedName("eu")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive11")
	static Archive archive11;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lfz;")
	@Export("current")
	Task current = null;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lfz;")
	@Export("task")
	Task task = null;

	@ObfuscatedName("c")
	@Export("thread")
	Thread thread;

	@ObfuscatedName("w")
	@Export("isClosed")
	boolean isClosed = false;

	public TaskHandler() {
		javaVendor = "Unknown";
		javaVersion = "1.6";
		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var2) {
		}
		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1663558948")
	@Export("close")
	public final void close() {
		synchronized(this) {
			this.isClosed = true;
			this.notifyAll();
		}
		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIILjava/lang/Object;I)Lfz;", garbageValue = "2040134052")
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task();
		var5.type = var1;
		var5.intArgument = var2;
		var5.objectArgument = var4;
		synchronized(this) {
			if (this.task != null) {
				this.task.next = var5;
				this.task = var5;
			} else {
				this.task = this.current = var5;
			}
			this.notify();
			return var5;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)Lfz;", garbageValue = "-1762952522")
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;II)Lfz;", garbageValue = "-212575664")
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1);
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) {
				while (true) {
					if (this.isClosed) {
						return;
					}
					if (this.current != null) {
						var1 = this.current;
						this.current = this.current.next;
						if (this.current == null) {
							this.task = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException var8) {
					}
				} 
			}
			try {
				int var5 = var1.type;
				if (var5 == 1) {
					var1.result = new Socket(InetAddress.getByName(((String) (var1.objectArgument))), var1.intArgument);
				} else if (var5 == 2) {
					Thread var3 = new Thread(((Runnable) (var1.objectArgument)));
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.intArgument);
					var1.result = var3;
				} else if (var5 == 4) {
					var1.result = new DataInputStream(((URL) (var1.objectArgument)).openStream());
				}
				var1.status = 1;
			} catch (ThreadDeath var6) {
				throw var6;
			} catch (Throwable var7) {
				var1.status = 2;
			}
		} 
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "784335958")
	static int method3253(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) {
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 1610) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 1613) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (var3.modelTransparency) ? 1 : 0;
			return 1;
		} else if (var0 != 1615 && var0 != 1616) {
			return 2;
		} else {
			++Interpreter_intStackSize;
			return 1;
		}
	}
}