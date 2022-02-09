import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ia")
public class class259 {
    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Lpg;")
    @Export("titlebuttonSprite")
    static IndexedSprite titlebuttonSprite;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1157177731")
    public static void method4999() {
        synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
            if (ArchiveDiskActionHandler.field3869 != 0) {
                ArchiveDiskActionHandler.field3869 = 1;
                try {
                    ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(ILkq;IIIZI)V", garbageValue = "1434577237")
    public static void method4997(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
        class265.musicPlayerStatus = 1;
        class265.musicTrackArchive = var1;
        class265.musicTrackGroupId = var2;
        class140.musicTrackFileId = var3;
        class167.musicTrackVolume = var4;
        MusicPatch.musicTrackBoolean = var5;
        GrandExchangeOfferNameComparator.pcmSampleLength = var0;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "0")
    public static void method4998(int var0) {
        class265.musicPlayerStatus = 1;
        class265.musicTrackArchive = null;
        class265.musicTrackGroupId = -1;
        class140.musicTrackFileId = -1;
        class167.musicTrackVolume = 0;
        MusicPatch.musicTrackBoolean = false;
        GrandExchangeOfferNameComparator.pcmSampleLength = var0;
    }
}