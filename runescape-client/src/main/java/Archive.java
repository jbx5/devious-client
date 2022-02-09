import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("kz")
@Implements("Archive")
public class Archive extends AbstractArchive {
    @ObfuscatedName("v")
    @Export("Archive_crc")
    static CRC32 Archive_crc;

    @ObfuscatedName("cw")
    @ObfuscatedSignature(descriptor = "[Lpg;")
    @Export("worldSelectStars")
    static IndexedSprite[] worldSelectStars;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lnb;")
    @Export("archiveDisk")
    ArchiveDisk archiveDisk;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Lnb;")
    @Export("masterDisk")
    ArchiveDisk masterDisk;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 1360582527)
    @Export("index")
    int index;

    @ObfuscatedName("o")
    volatile boolean field3873;

    @ObfuscatedName("i")
    boolean field3879;

    @ObfuscatedName("w")
    @Export("validGroups")
    volatile boolean[] validGroups;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 1972454573)
    @Export("indexCrc")
    int indexCrc;

    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = 1549892383)
    @Export("indexVersion")
    int indexVersion;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 1506122643)
    int field3884;

    static {
        Archive_crc = new CRC32();
    }

    @ObfuscatedSignature(descriptor = "(Lnb;Lnb;IZZZ)V")
    public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
        super(var4, var5);
        this.field3873 = false;
        this.field3879 = false;
        this.field3884 = -1;
        this.archiveDisk = var1;
        this.masterDisk = var2;
        this.index = var3;
        this.field3879 = var6;
        int var8 = this.index;
        if (class346.NetCache_reference != null) {
            class346.NetCache_reference.offset = (var8 * 8) + 5;
            int var9 = class346.NetCache_reference.readInt();
            int var10 = class346.NetCache_reference.readInt();
            this.loadIndex(var9, var10);
        } else {
            WorldMapSection1.requestNetFile(((Archive) (null)), 255, 255, 0, ((byte) (0)), true);
            NetCache.NetCache_archives[var8] = this;
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "828442357")
    public boolean method5521() {
        return this.field3873;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "957301933")
    @Export("percentage")
    public int percentage() {
        if (this.field3873) {
            return 100;
        } else if (super.groups != null) {
            return 99;
        } else {
            int var2 = this.index;
            long var3 = ((long) (var2 + 16711680));
            int var1;
            if ((class19.NetCache_currentResponse != null) && (class19.NetCache_currentResponse.key == var3)) {
                var1 = ((NetCache.NetCache_responseArchiveBuffer.offset * 99) / (NetCache.NetCache_responseArchiveBuffer.array.length - class19.NetCache_currentResponse.padding)) + 1;
            } else {
                var1 = 0;
            }
            int var5 = var1;
            if (var1 >= 100) {
                var5 = 99;
            }
            return var5;
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1851114887")
    @Export("loadRegionFromGroup")
    void loadRegionFromGroup(int var1) {
        int var2 = this.index;
        long var3 = ((long) ((var2 << 16) + var1));
        NetFileRequest var5 = ((NetFileRequest) (NetCache.NetCache_pendingWrites.get(var3)));
        if (var5 != null) {
            NetCache.NetCache_pendingWritesQueue.addLast(var5);
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-45")
    @Export("loadGroup")
    void loadGroup(int var1) {
        if (((this.archiveDisk != null) && (this.validGroups != null)) && this.validGroups[var1]) {
            class122.method2712(var1, this.archiveDisk, this);
        } else {
            WorldMapSection1.requestNetFile(this, this.index, var1, super.groupCrcs[var1], ((byte) (2)), true);
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-732158282")
    @Export("loadIndex")
    public void loadIndex(int var1, int var2) {
        this.indexCrc = var1;
        this.indexVersion = var2;
        if (this.masterDisk != null) {
            class122.method2712(this.index, this.masterDisk, this);
        } else {
            WorldMapSection1.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(I[BZZI)V", garbageValue = "-843194902")
    @Export("write")
    public void write(int var1, byte[] var2, boolean var3, boolean var4) {
        if (var3) {
            if (this.field3873) {
                throw new RuntimeException();
            }
            if (this.masterDisk != null) {
                int var5 = this.index;
                ArchiveDisk var6 = this.masterDisk;
                ArchiveDiskAction var7 = new ArchiveDiskAction();
                var7.type = 0;
                var7.key = ((long) (var5));
                var7.data = var2;
                var7.archiveDisk = var6;
                synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                    ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7);
                }
                synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
                    if (ArchiveDiskActionHandler.field3869 == 0) {
                        ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
                        ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
                        ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
                        ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
                    }
                    ArchiveDiskActionHandler.field3869 = 600;
                }
            }
            this.decodeIndex(var2);
            this.loadAllLocal();
        } else {
            var2[var2.length - 2] = ((byte) (super.groupVersions[var1] >> 8));
            var2[var2.length - 1] = ((byte) (super.groupVersions[var1]));
            if (this.archiveDisk != null) {
                ArchiveDisk var13 = this.archiveDisk;
                ArchiveDiskAction var19 = new ArchiveDiskAction();
                var19.type = 0;
                var19.key = ((long) (var1));
                var19.data = var2;
                var19.archiveDisk = var13;
                synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                    ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var19);
                }
                synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
                    if (ArchiveDiskActionHandler.field3869 == 0) {
                        ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
                        ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
                        ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
                        ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
                    }
                    ArchiveDiskActionHandler.field3869 = 600;
                }
                this.validGroups[var1] = true;
            }
            if (var4) {
                Object[] var21 = super.groups;
                Object var20;
                if (var2 == null) {
                    var20 = null;
                } else if (var2.length > 136) {
                    DirectByteArrayCopier var8 = new DirectByteArrayCopier();
                    var8.set(var2);
                    var20 = var8;
                } else {
                    var20 = var2;
                }
                var21[var1] = var20;
            }
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(Lnb;I[BZI)V", garbageValue = "-844092695")
    @Export("load")
    void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
        int var5;
        if (var1 == this.masterDisk) {
            if (this.field3873) {
                throw new RuntimeException();
            }
            if (var3 == null) {
                WorldMapSection1.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
                return;
            }
            Archive_crc.reset();
            Archive_crc.update(var3, 0, var3.length);
            var5 = ((int) (Archive_crc.getValue()));
            if (var5 != this.indexCrc) {
                WorldMapSection1.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
                return;
            }
            Buffer var11 = new Buffer(ArchiveLoader.decompressBytes(var3));
            int var12 = var11.readUnsignedByte();
            if ((var12 != 5) && (var12 != 6)) {
                throw new RuntimeException((((var12 + ",") + this.index) + ",") + var2);
            }
            int var8 = 0;
            if (var12 >= 6) {
                var8 = var11.readInt();
            }
            if (var8 != this.indexVersion) {
                WorldMapSection1.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
                return;
            }
            this.decodeIndex(var3);
            this.loadAllLocal();
        } else {
            if ((!var4) && (var2 == this.field3884)) {
                this.field3873 = true;
            }
            if ((var3 == null) || (var3.length <= 2)) {
                this.validGroups[var2] = false;
                if (this.field3879 || var4) {
                    WorldMapSection1.requestNetFile(this, this.index, var2, super.groupCrcs[var2], ((byte) (2)), var4);
                }
                return;
            }
            Archive_crc.reset();
            Archive_crc.update(var3, 0, var3.length - 2);
            var5 = ((int) (Archive_crc.getValue()));
            int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
            if ((var5 != super.groupCrcs[var2]) || (var6 != super.groupVersions[var2])) {
                this.validGroups[var2] = false;
                if (this.field3879 || var4) {
                    WorldMapSection1.requestNetFile(this, this.index, var2, super.groupCrcs[var2], ((byte) (2)), var4);
                }
                return;
            }
            this.validGroups[var2] = true;
            if (var4) {
                Object[] var7 = super.groups;
                Object var9;
                if (var3 == null) {
                    var9 = null;
                } else if (var3.length > 136) {
                    DirectByteArrayCopier var10 = new DirectByteArrayCopier();
                    var10.set(var3);
                    var9 = var10;
                } else {
                    var9 = var3;
                }
                var7[var2] = var9;
            }
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1939525425")
    @Export("loadAllLocal")
    void loadAllLocal() {
        this.validGroups = new boolean[super.groups.length];
        int var1;
        for (var1 = 0; var1 < this.validGroups.length; ++var1) {
            this.validGroups[var1] = false;
        }
        if (this.archiveDisk == null) {
            this.field3873 = true;
        } else {
            this.field3884 = -1;
            for (var1 = 0; var1 < this.validGroups.length; ++var1) {
                if (super.fileCounts[var1] > 0) {
                    UrlRequest.method2422(var1, this.archiveDisk, this);
                    this.field3884 = var1;
                }
            }
            if (this.field3884 == (-1)) {
                this.field3873 = true;
            }
        }
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "-105")
    @Export("groupLoadPercent")
    int groupLoadPercent(int var1) {
        if (super.groups[var1] != null) {
            return 100;
        } else if (this.validGroups[var1]) {
            return 100;
        } else {
            int var3 = this.index;
            long var4 = ((long) ((var3 << 16) + var1));
            int var2;
            if ((class19.NetCache_currentResponse != null) && (class19.NetCache_currentResponse.key == var4)) {
                var2 = ((NetCache.NetCache_responseArchiveBuffer.offset * 99) / (NetCache.NetCache_responseArchiveBuffer.array.length - class19.NetCache_currentResponse.padding)) + 1;
            } else {
                var2 = 0;
            }
            return var2;
        }
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-721473199")
    public boolean method5557(int var1) {
        return this.validGroups[var1];
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "1909333797")
    public boolean method5530(int var1) {
        return this.getGroupFileIds(var1) != null;
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "59")
    @Export("loadPercent")
    public int loadPercent() {
        int var1 = 0;
        int var2 = 0;
        int var3;
        for (var3 = 0; var3 < super.groups.length; ++var3) {
            if (super.fileCounts[var3] > 0) {
                var1 += 100;
                var2 += this.groupLoadPercent(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            var3 = (var2 * 100) / var1;
            return var3;
        }
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "27")
    @Export("Login_promptCredentials")
    static void Login_promptCredentials(boolean var0) {
        Login.Login_response1 = "";
        Login.Login_response2 = "Enter your username/email & password.";
        Login.Login_response3 = "";
        Player.method2159(2);
        if (var0) {
            Login.Login_password = "";
        }
        DynamicObject.method1998();
        WorldMapLabelSize.method4317();
    }

    @ObfuscatedName("je")
    @ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "-109")
    @Export("setTapToDrop")
    static void setTapToDrop(boolean var0) {
        Client.tapToDrop = var0;
    }
}