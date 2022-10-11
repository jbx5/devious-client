import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      descriptor = "[Lry;"
   )
   @Export("modIconSprites")
   static IndexedSprite[] modIconSprites;
   @ObfuscatedName("a")
   @Export("reversed")
   final boolean reversed;

   public UserComparator4(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lof;Lof;I)I",
      garbageValue = "941056838"
   )
   @Export("compare_bridged")
   int compare_bridged(Buddy var1, Buddy var2) {
      return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((Buddy)var1, (Buddy)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1111285286"
   )
   static final void method2732() {
      class11.method101("Your friend list is full. Max of 200 for free users, and 400 for members");
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1902813783"
   )
   static final void method2739(String var0) {
      class11.method101(var0 + " is already on your friend list");
   }

   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-60"
   )
   static final void method2738() {
      FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
      class148.method3155();
      InvDefinition.method3413();
      class145.method3072();
      class18.method268();
      WorldMapIcon_1.method4715();
      UrlRequest.method2726();
      class97.method2522();
      VarbitComposition.VarbitDefinition_cached.clear();
      class156.method3225();
      PcmPlayer.HitSplatDefinition_cachedSprites.method8210();
      class203.HitSplatDefinition_cached.method8210();
      HitSplatDefinition.HitSplatDefinition_cached.clear();
      HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
      HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
      HealthBarDefinition.HealthBarDefinition_cached.clear();
      HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
      StructComposition.StructDefinition_cached.clear();
      ArchiveDiskActionHandler.method6291();
      ObjectSound.method1854();
      DbTableType.DBTableType_cache.clear();
      DbRowType.DBRowType_cache.clear();
      Client.DBTableIndex_cache.clear();
      Client.DBTableMasterIndex_cache.clear();
      HorizontalAlignment.method3543();
      MusicPatchPcmStream.method5658();
      ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
      Script.Script_cached.clear();
      class150.archive5.clearFiles();
      MouseHandler.field251.clearFiles();
      PlayerType.archive7.clearFiles();
      Canvas.archive4.clearFiles();
      SecureRandomFuture.archive9.clearFiles();
      ReflectionCheck.archive6.clearFiles();
      WorldMapSectionType.archive11.clearFiles();
      class142.archive8.clearFiles();
      Client.field522.clearFiles();
      WorldMapRegion.archive10.clearFiles();
      class7.field32.clearFiles();
      class188.archive12.clearFiles();
      class250.field2930.clearFiles();
   }
}
