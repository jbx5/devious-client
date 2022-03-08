import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fc")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
    @ObfuscatedName("c")
    @Export("inputStream")
    InputStream inputStream;

    @ObfuscatedName("l")
    @Export("outputStream")
    OutputStream outputStream;

    @ObfuscatedName("s")
    @Export("socket")
    Socket socket;

    @ObfuscatedName("e")
    @Export("isClosed")
    boolean isClosed;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lex;")
    @Export("taskHandler")
    TaskHandler taskHandler;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lfw;")
    @Export("task")
    Task task;

    @ObfuscatedName("i")
    @Export("outBuffer")
    byte[] outBuffer;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -818522115)
    @Export("outLength")
    int outLength;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 991491695)
    @Export("outOffset")
    int outOffset;

    @ObfuscatedName("a")
    @Export("exceptionWriting")
    boolean exceptionWriting;

    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = 123579555)
    @Export("bufferLength")
    final int bufferLength;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1696123211)
    @Export("maxPacketLength")
    final int maxPacketLength;

    @ObfuscatedSignature(descriptor = "(Ljava/net/Socket;Lex;I)V")
    public NetSocket(Socket var1, TaskHandler var2, int var3) throws IOException {
        this.isClosed = false;
        this.outLength = 0;
        this.outOffset = 0;
        this.exceptionWriting = false;
        this.taskHandler = var2;
        this.socket = var1;
        this.bufferLength = var3;
        this.maxPacketLength = var3 - 100;
        this.socket.setSoTimeout(30000);
        this.socket.setTcpNoDelay(true);
        this.socket.setReceiveBufferSize(65536);
        this.socket.setSendBufferSize(65536);
        this.inputStream = this.socket.getInputStream();
        this.outputStream = this.socket.getOutputStream();
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-499949391")
    @Export("close")
    public void close() {
        if (!this.isClosed) {
            synchronized(this) {
                this.isClosed = true;
                this.notifyAll();
            }
            if (this.task != null) {
                while (this.task.status == 0) {
                    Language.method5813(1L);
                } 
                if (this.task.status == 1) {
                    try {
                        ((Thread) (this.task.result)).join();
                    } catch (InterruptedException var3) {
                    }
                }
            }
            this.task = null;
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-86")
    @Export("readUnsignedByte")
    public int readUnsignedByte() throws IOException {
        return this.isClosed ? 0 : this.inputStream.read();
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2115909346")
    @Export("available")
    public int available() throws IOException {
        return this.isClosed ? 0 : this.inputStream.available();
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "67")
    @Export("isAvailable")
    public boolean isAvailable(int var1) throws IOException {
        if (this.isClosed) {
            return false;
        } else {
            return this.inputStream.available() >= var1;
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "([BIII)I", garbageValue = "-781316249")
    @Export("read")
    public int read(byte[] var1, int var2, int var3) throws IOException {
        if (this.isClosed) {
            return 0;
        } else {
            int var4;
            int var5;
            for (var4 = var3; var3 > 0; var3 -= var5) {
                var5 = this.inputStream.read(var1, var2, var3);
                if (var5 <= 0) {
                    throw new EOFException();
                }
                var2 += var5;
            }
            return var4;
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "([BIIS)V", garbageValue = "155")
    @Export("write0")
    void write0(byte[] var1, int var2, int var3) throws IOException {
        if (!this.isClosed) {
            if (this.exceptionWriting) {
                this.exceptionWriting = false;
                throw new IOException();
            } else {
                if (this.outBuffer == null) {
                    this.outBuffer = new byte[this.bufferLength];
                }
                synchronized(this) {
                    for (int var5 = 0; var5 < var3; ++var5) {
                        this.outBuffer[this.outOffset] = var1[var5 + var2];
                        this.outOffset = (this.outOffset + 1) % this.bufferLength;
                        if (((this.maxPacketLength + this.outLength) % this.bufferLength) == this.outOffset) {
                            throw new IOException();
                        }
                    }
                    if (this.task == null) {
                        this.task = this.taskHandler.newThreadTask(this, 3);
                    }
                    this.notifyAll();
                }
            }
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "([BIII)V", garbageValue = "300460862")
    @Export("write")
    public void write(byte[] var1, int var2, int var3) throws IOException {
        this.write0(var1, var2, var3);
    }

    public void run() {
        try {
            while (true) {
                label84 : {
                    int var1;
                    int var2;
                    synchronized(this) {
                        if (this.outLength == this.outOffset) {
                            if (this.isClosed) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        var2 = this.outLength;
                        if (this.outOffset >= this.outLength) {
                            var1 = this.outOffset - this.outLength;
                        } else {
                            var1 = this.bufferLength - this.outLength;
                        }
                    }
                    if (var1 <= 0) {
                        continue;
                    }
                    try {
                        this.outputStream.write(this.outBuffer, var2, var1);
                    } catch (IOException var9) {
                        this.exceptionWriting = true;
                    }
                    this.outLength = (var1 + this.outLength) % this.bufferLength;
                    try {
                        if (this.outLength == this.outOffset) {
                            this.outputStream.flush();
                        }
                    } catch (IOException var8) {
                        this.exceptionWriting = true;
                    }
                    continue;
                }
                try {
                    if (this.inputStream != null) {
                        this.inputStream.close();
                    }
                    if (this.outputStream != null) {
                        this.outputStream.close();
                    }
                    if (this.socket != null) {
                        this.socket.close();
                    }
                } catch (IOException var7) {
                }
                this.outBuffer = null;
                break;
            } 
        } catch (Exception var12) {
            FloorDecoration.RunException_sendStackTrace(((String) (null)), var12);
        }
    }

    protected void finalize() {
        this.close();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IB)Lfs;", garbageValue = "1")
    public static HealthBarDefinition method3073(int var0) {
        HealthBarDefinition var1 = ((HealthBarDefinition) (HealthBarDefinition.HealthBarDefinition_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
            var1 = new HealthBarDefinition();
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }
            HealthBarDefinition.HealthBarDefinition_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1639582857")
    public static void method3105() {
        try {
            if (class265.musicPlayerStatus == 1) {
                int var0 = class265.midiPcmStream.method5096();
                if ((var0 > 0) && class265.midiPcmStream.isReady()) {
                    var0 -= GrandExchangeOfferNameComparator.pcmSampleLength;
                    if (var0 < 0) {
                        var0 = 0;
                    }
                    class265.midiPcmStream.setPcmStreamVolume(var0);
                    return;
                }
                class265.midiPcmStream.clear();
                class265.midiPcmStream.removeAll();
                if (class265.musicTrackArchive != null) {
                    class265.musicPlayerStatus = 2;
                } else {
                    class265.musicPlayerStatus = 0;
                }
                class265.musicTrack = null;
                FileSystem.soundCache = null;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class265.midiPcmStream.clear();
            class265.musicPlayerStatus = 0;
            class265.musicTrack = null;
            FileSystem.soundCache = null;
            class265.musicTrackArchive = null;
        }
    }

    @ObfuscatedName("fw")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1276680943")
    static void method3096(int var0, int var1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; ++var3) {
            int var4 = ((var3 * 32) + 15) + 128;
            int var5 = (var4 * 3) + 600;
            int var7 = Rasterizer3D.Rasterizer3D_sine[var4];
            int var6 = class167.method3254(var5, var1);
            var2[var3] = (var6 * var7) >> 16;
        }
        Scene.Scene_buildVisiblityMap(var2, 500, 800, (var0 * 334) / var1, 334);
    }
}