import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import net.runelite.mapping.Export;
@ObfuscatedName("np")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("c")
	@Export("socket")
	Socket socket;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lnw;")
	@Export("source")
	BufferedSource source;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lnc;")
	@Export("sink")
	BufferedSink sink;

	BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.source = new BufferedSource(this.socket.getInputStream(), var2);
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "1")
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-439883726")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1889844897")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "([BIII)I", garbageValue = "695516749")
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "1416716039")
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-17278531")
	@Export("close")
	public void close() {
		this.sink.close();
		try {
			this.socket.close();
		} catch (IOException var2) {
		}
		this.source.close();
	}

	protected void finalize() {
		this.close();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(B)Ljava/util/Date;", garbageValue = "-61")
	static Date method6835() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(Lfr;IIS)Lar;", garbageValue = "8848")
	public static final PcmPlayer method6849(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}
			try {
				PcmPlayer var3 = ModelData0.pcmPlayerProvider.player();
				var3.samples = new int[256 * (BuddyRankComparator.PcmPlayer_stereo ? 2 : 1)];
				var3.field282 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}
				var3.open(var3.capacity);
				if (HealthBarUpdate.field1212 > 0 && PcmPlayer.soundSystem == null) {
					PcmPlayer.soundSystem = new SoundSystem();
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}
				if (PcmPlayer.soundSystem != null) {
					if (PcmPlayer.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}
					PcmPlayer.soundSystem.players[var1] = var3;
				}
				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(descriptor = "([Lkb;Lkb;ZI)V", garbageValue = "1435342792")
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = (var1.scrollWidth != 0) ? var1.scrollWidth * 1710798627 * 1791635595 : var1.width * 1623184389 * 2092161229;
		int var4 = (var1.scrollHeight != 0) ? var1.scrollHeight * -1042306339 * -1548911243 : var1.height * 514298127 * 236010991;
		class118.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			class118.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}
		InterfaceParent var5 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var1.id)))));
		if (var5 != null) {
			int var6 = var5.group;
			if (WorldMapSection2.loadInterface(var6)) {
				class118.resizeInterface(SoundCache.Widget_interfaceComponents[var6], -1, var3, var4, var2);
			}
		}
		if (var1.contentType == 1337) {
		}
	}
}