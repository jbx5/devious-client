import java.util.Comparator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
class class18 implements Comparator {
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Ll;"
   )
   final class10 this$0;

   @ObfuscatedSignature(
      descriptor = "(Ll;)V"
   )
   class18(class10 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
      garbageValue = "-16"
   )
   int method261(Map.Entry var1, Map.Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method261((Map.Entry)var1, (Map.Entry)var2);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-827032220"
   )
   public static void method267() {
      class37.reflectionChecks = new IterableNodeDeque();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Llg;IIIZB)V",
      garbageValue = "55"
   )
   public static void method266(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
      class283.musicPlayerStatus = 1;
      DevicePcmPlayerProvider.musicTrackArchive = var0;
      class283.musicTrackGroupId = var1;
      class283.musicTrackFileId = var2;
      Messages.musicTrackVolume = var3;
      GrandExchangeEvents.musicTrackBoolean = var4;
      class19.pcmSampleLength = 10000;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   public static void method268() {
      NPCComposition.NpcDefinition_cached.clear();
      NPCComposition.NpcDefinition_cachedModels.clear();
   }
}
