import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class338 {
	@ObfuscatedName("wd")
	@ObfuscatedGetter(
		intValue = 1390084827
	)
	public static int field794;
	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	static final class276 field796;
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	static final ApproximateRouteStrategy field741;
	@ObfuscatedName("wc")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wg")
	static int[] field801;
	@ObfuscatedName("ws")
	@ObfuscatedGetter(
		intValue = 1447845819
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wn")
	static int[] field802;
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = 1451505263
	)
	static int field799;
	@ObfuscatedName("wz")
	static List field795;
	@ObfuscatedName("bl")
	static boolean field776;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1046092007
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1526339177
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -81469145
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cb")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cr")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 912440835
	)
	static int field570;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1897617417
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1085180295
	)
	static int field509;
	@ObfuscatedName("cy")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("da")
	static boolean field512;
	@ObfuscatedName("dp")
	static boolean field513;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -979874671
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dl")
	static boolean field515;
	@ObfuscatedName("de")
	static boolean field516;
	@ObfuscatedName("dc")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1216057659
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 266320021
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		longValue = 3365111090649259861L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 2077558499
	)
	static int field521;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 477624259
	)
	static int field662;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		longValue = -8145544669993232155L
	)
	static long field523;
	@ObfuscatedName("dt")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 66010591
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -75376615
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1054191883
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -98951485
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 108291681
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -365135345
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = -736882028
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -1894331712
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -152680384
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("em")
	@Export("z")
	static boolean z;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static class94 field779;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 1525972495
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 1457650225
	)
	static int field539;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = -680882449
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = -1755730117
	)
	static int field543;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = -1769063121
	)
	static int field542;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = 1703324495
	)
	static int field672;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	static class553 field545;
	@ObfuscatedName("go")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("gc")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("hc")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("ht")
	static int[] field532;
	@ObfuscatedName("hk")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = 1531988091
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("hz")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 1259663321
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ip")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("it")
	static String field659;
	@ObfuscatedName("ib")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 418567257
	)
	static int field573;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 1796951221
	)
	static int field574;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = 1530435431
	)
	static int field575;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 204047315
	)
	static int field785;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 871889707
	)
	static int field704;
	@ObfuscatedName("jx")
	static int[][][] field767;
	@ObfuscatedName("jy")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jh")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jn")
	static final int[] field581;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 425457783
	)
	static int field582;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = 1015696873
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = 10055639
	)
	static int field611;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = 25052165
	)
	static int field585;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = -1409300149
	)
	static int field717;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = 847390165
	)
	static int field587;
	@ObfuscatedName("kl")
	static boolean field588;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 1118843171
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = -96383807
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -861187013
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 1705553879
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = -827639435
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 1589609807
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = 1696413233
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = 2026665675
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -1478210699
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 510576821
	)
	static int field598;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 458398027
	)
	static int field502;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 288382171
	)
	static int field681;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -2127153517
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 1650375793
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 1204777839
	)
	@Export("revision")
	static int revision;
	@ObfuscatedName("lz")
	static boolean field632;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -985586305
	)
	static int field777;
	@ObfuscatedName("la")
	static boolean field606;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = 1017620401
	)
	static int field501;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 1551911937
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = 1434153955
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("lm")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("lf")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("lp")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("lh")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("lx")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("le")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("lc")
	static int[][] field616;
	@ObfuscatedName("mj")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("mm")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -1130258367
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = -1949536795
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 1714430649
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 634785923
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -728657871
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = 1239043353
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -2021744345
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mc")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = -791341049
	)
	static int field586;
	@ObfuscatedName("ml")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = -337361593
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -1415382221
	)
	static int field630;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		longValue = -6480287401041715695L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		longValue = -5596908553604827889L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("mo")
	static String field633;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = -677471247
	)
	static int field634;
	@ObfuscatedName("mt")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = 61596865
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = 981643761
	)
	static int field637;
	@ObfuscatedName("nk")
	static int[] field584;
	@ObfuscatedName("nn")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("nf")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nm")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ny")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = -1939635249
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("ne")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nw")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nx")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nl")
	static int[] field647;
	@ObfuscatedName("nz")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("nb")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	@Export("menu")
	static Menu menu;
	@ObfuscatedName("nt")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("nj")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("nq")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = 1110646025
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = -1695165071
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 978796467
	)
	static int field656;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -86855225
	)
	static int field657;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = 427506737
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ow")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = 356542135
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 34901359
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("ot")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("oi")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = 845445381
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 1112672905
	)
	static int field668;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 2046715159
	)
	static int field669;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -1155481551
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1002438915
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = 106084685
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -1202393031
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = -667910737
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pq")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = -1187046575
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 446951707
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pp")
	static boolean field683;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -1158462155
	)
	static int field661;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -1465432071
	)
	static int field766;
	@ObfuscatedName("py")
	static boolean field604;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = -1320575347
	)
	static int field635;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = -704176001
	)
	static int field688;
	@ObfuscatedName("ps")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = -84139147
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pz")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = -1427256987
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("pa")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = -2033558199
	)
	static int field572;
	@ObfuscatedName("qs")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = 1887752823
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("qa")
	static int[] field697;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -2082505947
	)
	static int field698;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -293747467
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = 819069929
	)
	static int field503;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = -647616161
	)
	static int field701;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = 1887603267
	)
	static int field803;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 961041553
	)
	static int field562;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = -1204755379
	)
	static int field751;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -1406964297
	)
	static int field705;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 2075655169
	)
	static int field706;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -327250851
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	static class566 field708;
	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	static NodeDeque field712;
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 377212349
	)
	@Export("rootWidgetCount")
	public static int rootWidgetCount;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = -1371964979
	)
	static int field686;
	@ObfuscatedName("rg")
	@Export("validRootWidgets")
	public static boolean[] validRootWidgets;
	@ObfuscatedName("rw")
	public static boolean[] field685;
	@ObfuscatedName("rm")
	static boolean[] field763;
	@ObfuscatedName("rk")
	@Export("rootWidgetXs")
	public static int[] rootWidgetXs;
	@ObfuscatedName("rs")
	@Export("rootWidgetYs")
	public static int[] rootWidgetYs;
	@ObfuscatedName("ra")
	@Export("rootWidgetWidths")
	public static int[] rootWidgetWidths;
	@ObfuscatedName("rx")
	@Export("rootWidgetHeights")
	public static int[] rootWidgetHeights;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = 1052614619
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		longValue = 679998500454744057L
	)
	static long field724;
	@ObfuscatedName("rd")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = 503756891
	)
	static int field726;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = 1951377595
	)
	static int field727;
	@ObfuscatedName("rh")
	static int[] field687;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = -914899589
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = 81678189
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("re")
	static String field731;
	@ObfuscatedName("rr")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = 1498765589
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("indexCheck")
	static IndexCheck indexCheck;
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static class265 field735;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -999054387
	)
	static int field736;
	@ObfuscatedName("so")
	static int[] field737;
	@ObfuscatedName("sk")
	static int[] field651;
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		longValue = -2975225486177793063L
	)
	static long field676;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "[Lgg;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "[Lgx;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = -1308480335
	)
	static int field742;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -428725065
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("ss")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("sd")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = -1601026423
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 1386240507
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tl")
	@ObfuscatedGetter(
		intValue = 1500693251
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("ti")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -1200488643
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tq")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ty")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tp")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("tg")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("te")
	static int[] field756;
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "[Lbf;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("tx")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("tz")
	static boolean field759;
	@ObfuscatedName("to")
	static boolean field760;
	@ObfuscatedName("tj")
	static boolean field514;
	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	static class512 field762;
	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static class511 field517;
	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static class511 field615;
	@ObfuscatedName("um")
	static boolean field765;
	@ObfuscatedName("uy")
	static boolean[] field764;
	@ObfuscatedName("uz")
	static int[] field508;
	@ObfuscatedName("uo")
	static int[] field768;
	@ObfuscatedName("uj")
	static int[] field769;
	@ObfuscatedName("ub")
	static int[] field770;
	@ObfuscatedName("uc")
	static short field771;
	@ObfuscatedName("un")
	static short field691;
	@ObfuscatedName("ur")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("uq")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("uu")
	static short field546;
	@ObfuscatedName("ue")
	static short field775;
	@ObfuscatedName("vh")
	static short field579;
	@ObfuscatedName("vs")
	static short field778;
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = 1717722115
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vj")
	@ObfuscatedGetter(
		intValue = 917991661
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vm")
	@ObfuscatedGetter(
		intValue = 119972583
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vd")
	@ObfuscatedGetter(
		intValue = 606898777
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = -597595107
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("va")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("playerAppearance")
	static final PlayerComposition playerAppearance;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = 1023260299
	)
	static int field618;
	@ObfuscatedName("vt")
	@ObfuscatedGetter(
		intValue = 1107035963
	)
	static int field786;
	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	static class508 field787;
	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "[Lpc;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("vv")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("vu")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	static class462 field790;
	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("vf")
	@ObfuscatedGetter(
		intValue = -303668783
	)
	static int field793;
	@ObfuscatedName("gd")
	@Export("token")
	String token;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("gq")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("gj")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("gy")
	@Export("https")
	boolean https;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 813892221
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("ga")
	@Export("refreshAccessTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("gv")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	Buffer field507;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	class7 field563;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		longValue = 2379116110242265617L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field776 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field570 = -1;
		clientType = -1;
		field509 = -1;
		onMobile = false;
		class546.field5371 = 224;
		field512 = false;
		field513 = false;
		gameState = 0;
		field515 = false;
		field516 = false;
		isLoading = true;
		cycle = 0;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field521 = -1;
		field662 = -1;
		field523 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		z = false;
		field779 = class94.field1142;
		js5ConnectState = 0;
		field539 = 0;
		js5Errors = 0;
		field543 = 0;
		field542 = 0;
		field672 = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field545 = class553.field5435;
		BASIC_AUTH_DESKTOP_OSRS = GrandExchangeOfferWorldComparator.base64Encode(CollisionMap.method5419("com_jagex_auth_desktop_osrs:public"));
		BASIC_AUTH_DESKTOP_RUNELITE = GrandExchangeOfferWorldComparator.base64Encode(CollisionMap.method5419("com_jagex_auth_desktop_runelite:public"));
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		field532 = new int[4];
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field573 = 0;
		field574 = 1;
		field575 = 0;
		field785 = 1;
		field704 = 0;
		field767 = new int[4][13][13];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field581 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field582 = -1;
		graphicsCycle = 0;
		field611 = 2301979;
		field585 = 5063219;
		field717 = 3353893;
		field587 = 7759444;
		field588 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field598 = 0;
		field502 = 0;
		field681 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		revision = 0;
		field632 = false;
		field777 = 0;
		field606 = false;
		field501 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field616 = new int[overheadTextLimit][];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field586 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field630 = 0;
		userId = -1L;
		userHash = -1L;
		field633 = "";
		field634 = -1;
		renderSelf = true;
		drawPlayerNames = 0;
		field637 = 0;
		field584 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field647 = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menu = new Menu(true);
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field656 = 0;
		field657 = 50;
		isItemSelected = 0;
		field659 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field668 = 0;
		field669 = -1;
		chatEffects = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field683 = false;
		field661 = -1;
		field766 = -1;
		field604 = false;
		field635 = -1;
		field688 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field572 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field697 = new int[32];
		field698 = 0;
		chatCycle = 0;
		field503 = 0;
		field701 = 0;
		field803 = 0;
		field562 = 0;
		field751 = 0;
		field705 = 0;
		field706 = 0;
		mouseWheelRotation = 0;
		field708 = new class566();
		scriptEvents = new NodeDeque();
		scriptEvents2 = new NodeDeque();
		scriptEvents3 = new NodeDeque();
		field712 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field686 = -2;
		validRootWidgets = new boolean[100];
		field685 = new boolean[100];
		field763 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field724 = 0L;
		isResizable = true;
		field726 = 600;
		field727 = field726 / GameEngine.cycleDurationMillis;
		field687 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field731 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		indexCheck = new IndexCheck();
		field735 = new class265();
		field736 = 0;
		field737 = new int[128];
		field651 = new int[128];
		field676 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field742 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		field756 = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field759 = false;
		field760 = false;
		field514 = false;
		field762 = null;
		field517 = null;
		field615 = null;
		field765 = false;
		field764 = new boolean[5];
		field508 = new int[5];
		field768 = new int[5];
		field769 = new int[5];
		field770 = new int[5];
		field771 = 256;
		field691 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field546 = 1;
		field775 = 32767;
		field579 = 1;
		field778 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field618 = -1;
		field786 = -1;
		field787 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field790 = new class462(8, class460.field4876);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field793 = -1;
		field794 = -1;
		field795 = new ArrayList();
		field796 = new class276();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field799 = 0;
		field741 = new ApproximateRouteStrategy();
		field801 = new int[50];
		field802 = new int[50];
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-24166"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field724 = RouteStrategy.method5439() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1246(true);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1948520576"
	)
	@Export("setUp")
	protected final void setUp() {
		UserComparator8.method3049(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		class380.field4407 = class453.method8428(worldProperties, class543.field5344);
		SoundCache.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class253.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		VarpDefinition.currentPort = SoundCache.worldPort;
		AbstractRasterProvider.field5460 = class359.field3787;
		HorizontalAlignment.field2553 = class359.field3788;
		class499.field5063 = class359.field3789;
		class109.field1390 = class359.field3794;
		Canvas.urlRequester = new SecureUrlRequester(this.https, 224);
		this.setUpKeyboard();
		this.setUpMouse();
		class322.mouseWheel = this.mouseWheel();
		this.method504(field735, 0);
		this.method504(indexCheck, 1);
		this.setUpClipboard();
		class92.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		TileItem.clientPreferences = Message.method1185();
		class535.method9457(this, GameEngine.field186);
		VarbitComposition.setWindowedMode(TileItem.clientPreferences.getWindowMode());
		class277.friendSystem = new FriendSystem(ObjectSound.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		ObjectSound.method2013(this);
		field796.method5493();
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "680168848"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				boolean var5 = false;
				boolean var6 = false;
				if (!class332.field3566.isEmpty()) {
					SongTask var4 = (SongTask)class332.field3566.get(0);
					if (var4 == null) {
						class332.field3566.remove(0);
					} else if (var4.vmethod8342()) {
						if (var4.method8321()) {
							System.out.println("Error in midimanager.service: " + var4.method8326());
							var5 = true;
						} else {
							if (var4.method8328() != null) {
								class332.field3566.add(1, var4.method8328());
							}

							var6 = var4.method8322();
						}

						class332.field3566.remove(0);
					} else {
						var6 = var4.method8322();
					}
				}

				if (var5) {
					class332.field3566.clear();
					WorldMapLabelSize.method5532();
				}

				if (var6 && playingJingle && class132.pcmPlayer1 != null) {
					class132.pcmPlayer1.tryDiscard();
				}

				ClanChannelMember.method3363();
				indexCheck.method5371();
				this.method460();
				UrlRequest.method3023();
				if (class322.mouseWheel != null) {
					int var9 = class322.mouseWheel.useRotation();
					mouseWheelRotation = var9;
				}

				if (gameState == 0) {
					class6.method36();
					UserComparator5.method3061();
				} else if (gameState == 5) {
					AbstractByteArrayCopier.loginScreen(this, Occluder.fontPlain11, GrandExchangeOfferUnitPriceComparator.fontPlain12);
					class6.method36();
					UserComparator5.method3061();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						AbstractByteArrayCopier.loginScreen(this, Occluder.fontPlain11, GrandExchangeOfferUnitPriceComparator.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						AbstractByteArrayCopier.loginScreen(this, Occluder.fontPlain11, GrandExchangeOfferUnitPriceComparator.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						if (field512) {
							class47.loadRegion();
						}

						if (field513) {
							FontName.method9265(HttpMethod.field36);
						}

						if (!field513 && !field512) {
							UserComparator3.updateGameState(30);
						}
					}
				} else {
					AbstractByteArrayCopier.loginScreen(this, Occluder.fontPlain11, GrandExchangeOfferUnitPriceComparator.fontPlain12);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1345054426"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && field724 != 0L && RouteStrategy.method5439() > field724) {
			VarbitComposition.setWindowedMode(LoginPacket.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, class155.field1718);
		} else if (gameState == 5) {
			Canvas.drawTitle(WorldMapLabelSize.fontBold12, Occluder.fontPlain11, GrandExchangeOfferUnitPriceComparator.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				Canvas.drawTitle(WorldMapLabelSize.fontBold12, Occluder.fontPlain11, GrandExchangeOfferUnitPriceComparator.fontPlain12);
			} else if (gameState == 50) {
				Canvas.drawTitle(WorldMapLabelSize.fontBold12, Occluder.fontPlain11, GrandExchangeOfferUnitPriceComparator.fontPlain12);
			} else if (gameState == 25) {
				if (field704 == 1) {
					if (field573 > field574) {
						field574 = field573;
					}

					var2 = (field574 * 50 - field573 * 50) / field574;
					HorizontalAlignment.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field704 == 2) {
					if (field575 > field785) {
						field785 = field575;
					}

					var2 = (field785 * 50 - field575 * 50) / field785 + 50;
					HorizontalAlignment.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					HorizontalAlignment.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				HorizontalAlignment.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				HorizontalAlignment.drawLoadingMessage("Please wait...", false);
			}
		} else {
			Canvas.drawTitle(WorldMapLabelSize.fontBold12, Occluder.fontPlain11, GrandExchangeOfferUnitPriceComparator.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field685[var2]) {
					class299.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field685[var2] = false;
				}
			}
		} else if (gameState > 0) {
			class299.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field685[var2] = false;
			}
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	@Export("kill0")
	protected final void kill0() {
		if (ObjectComposition.varcs != null && ObjectComposition.varcs.hasUnwrittenChanges()) {
			ObjectComposition.varcs.write();
		}

		if (Friend.mouseRecorder != null) {
			Friend.mouseRecorder.isRunning = false;
		}

		Friend.mouseRecorder = null;
		packetWriter.close();
		class318.method6150();
		class322.mouseWheel = null;
		if (class132.pcmPlayer1 != null) {
			class132.pcmPlayer1.shutdown();
		}

		SecureRandomFuture.field980.method7358();
		class169.method3598();
		if (Canvas.urlRequester != null) {
			Canvas.urlRequester.close();
			Canvas.urlRequester = null;
		}

		ViewportMouse.method4375();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "24"
	)
	protected final void vmethod1215() {
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1465903960"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2107812961"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return SecureUrlRequester.accessToken != null && !SecureUrlRequester.accessToken.trim().isEmpty() && ApproximateRouteStrategy.refreshToken != null && !ApproximateRouteStrategy.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1152606874"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return LoginState.sessionId != null && !LoginState.sessionId.trim().isEmpty() && HttpResponse.characterId != null && !HttpResponse.characterId.trim().isEmpty();
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-51"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "572558205"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class246.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(class246.authServiceBaseUrl)).getHost());
		var4.accept(HttpContentType.APPLICATION_JSON);
		HttpMethod var5 = HttpMethod.POST;
		RefreshAccessTokenRequester var6 = this.refreshAccessTokenRequester;
		if (var6 != null) {
			this.refreshAccessTokenRequestFuture = var6.request(var5.getName(), var3, var4.getHeaders(), "");
		} else {
			HttpRequest var7 = new HttpRequest(var3, var5, var4, this.https);
			this.asyncAccessTokenResponse = this.asyncRestClient.submitRequest(var7);
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "62"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(class246.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		HttpHeaders var3 = new HttpHeaders();
		var3.bearerToken(var1);
		HttpMethod var4 = HttpMethod.GET;
		OtlTokenRequester var5 = this.otlTokenRequester;
		if (var5 != null) {
			this.otlTokenRequestFuture = var5.request(var4.getName(), var2, var3.getHeaders(), "");
		} else {
			HttpRequest var6 = new HttpRequest(var2, var4, var3, this.https);
			this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var6);
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1381926385"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class31.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = SecureRandomFuture.field980.method7349();
			if (!var1) {
				this.method1557();
			}

		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1907913116"
	)
	void method1557() {
		if (SecureRandomFuture.field980.field4534 >= 4) {
			this.error("js5crc");
			UserComparator3.updateGameState(1000);
		} else {
			if (SecureRandomFuture.field980.field4537 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					UserComparator3.updateGameState(1000);
					return;
				}

				field539 = 3000;
				SecureRandomFuture.field980.field4537 = 3;
			}

			if (--field539 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class372.js5SocketTask = GameEngine.taskHandler.newSocketTask(class498.worldHost, VarpDefinition.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class372.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class372.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						Socket var2 = (Socket)class372.js5SocketTask.result;
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
						class60.js5Socket = var1;
						Buffer var3;
						if (class546.field5371 >= 223) {
							var3 = new Buffer(class325.field3530.field3528 + 1);
							var3.writeByte(class325.field3530.field3525);
							var3.writeInt(224);
							var3.writeInt(field532[0]);
							var3.writeInt(field532[1]);
							var3.writeInt(field532[2]);
							var3.writeInt(field532[3]);
							class60.js5Socket.write(var3.array, 0, class325.field3530.field3528 + 1);
						} else {
							var3 = new Buffer(5);
							var3.writeByte(class325.field3530.field3525);
							var3.writeInt(224);
							class60.js5Socket.write(var3.array, 0, 5);
						}

						++js5ConnectState;
						SecureRandomCallable.field1033 = RouteStrategy.method5439();
					}

					if (js5ConnectState == 3) {
						if (class60.js5Socket.available() > 0) {
							int var4 = class60.js5Socket.readUnsignedByte();
							if (var4 != 0) {
								this.js5Error(var4);
								return;
							}

							++js5ConnectState;
						} else if (RouteStrategy.method5439() - SecureRandomCallable.field1033 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						SecureRandomFuture.field980.method7351(class60.js5Socket, gameState > 20);
						class372.js5SocketTask = null;
						class60.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var5) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1762250429"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class372.js5SocketTask = null;
		class60.js5Socket = null;
		js5ConnectState = 0;
		if (VarpDefinition.currentPort == SoundCache.worldPort) {
			VarpDefinition.currentPort = class253.js5Port;
		} else {
			VarpDefinition.currentPort = SoundCache.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				UserComparator3.updateGameState(1000);
			} else {
				field539 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			UserComparator3.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				UserComparator3.updateGameState(1000);
			} else {
				field539 = 3000;
			}
		}

	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-96383807"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (LoginState.SHUTDOWN_PREVIOUS_CONNECTION == class33.loginState) {
				if (WorldMapIcon_1.field3044 == null && (secureRandomFuture.isDone() || field543 > 250)) {
					WorldMapIcon_1.field3044 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (WorldMapIcon_1.field3044 != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					class449.field4813 = null;
					hadNetworkError = false;
					field543 = 0;
					if (field545.method9903()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(ApproximateRouteStrategy.refreshToken);
								SoundSystem.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var22) {
								Script.RunException_sendStackTrace((String)null, var22);
								ClanChannelMember.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								ClanChannelMember.getLoginError(65);
								return;
							}

							try {
								this.authenticate(LoginState.sessionId, HttpResponse.characterId);
								SoundSystem.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var21) {
								Script.RunException_sendStackTrace((String)null, var21);
								ClanChannelMember.getLoginError(65);
								return;
							}
						}
					} else {
						SoundSystem.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var24;
			if (class33.loginState == LoginState.TOKEN_RESPONSE) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						ClanChannelMember.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							ClanChannelMember.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						SecureUrlRequester.accessToken = var3.getAccessToken();
						ApproximateRouteStrategy.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var20) {
						Script.RunException_sendStackTrace((String)null, var20);
						ClanChannelMember.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						ClanChannelMember.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						Script.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						ClanChannelMember.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var24 = this.asyncAccessTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						ClanChannelMember.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field543 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var24.getResponseBody());

					try {
						SecureUrlRequester.accessToken = var4.getBody().getString("access_token");
						ApproximateRouteStrategy.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var19) {
						Script.RunException_sendStackTrace("Error parsing tokens", var19);
						ClanChannelMember.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(SecureUrlRequester.accessToken);
				SoundSystem.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (class33.loginState == LoginState.REFRESHING_TOKEN) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						ClanChannelMember.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var25.isSuccess()) {
							ClanChannelMember.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var25.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var18) {
						Script.RunException_sendStackTrace((String)null, var18);
						ClanChannelMember.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						ClanChannelMember.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						Script.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						ClanChannelMember.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var24 = this.asyncGameSessionTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						Script.RunException_sendStackTrace("Response code: " + var24.getResponseCode() + "Response body: " + var24.getResponseBody(), (Throwable)null);
						ClanChannelMember.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var27 = (List)var24.getHeaderFields().get("Content-Type");
					if (var27 != null && var27.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var24.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var17) {
							Script.RunException_sendStackTrace((String)null, var17);
							ClanChannelMember.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var24.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field543 = 0;
				SoundSystem.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (LoginState.INIT_MOUSEHANDLER_SOCKET == class33.loginState) {
				if (class449.field4813 == null) {
					class449.field4813 = GameEngine.taskHandler.newSocketTask(class498.worldHost, VarpDefinition.currentPort);
				}

				if (class449.field4813.status == 2) {
					throw new IOException();
				}

				if (class449.field4813.status == 1) {
					Socket var28 = (Socket)class449.field4813.result;
					BufferedNetSocket var26 = new BufferedNetSocket(var28, 40000, 5000);
					var1 = var26;
					packetWriter.setSocket(var26);
					class449.field4813 = null;
					SoundSystem.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var30;
			if (class33.loginState == LoginState.UNMAPPED_20) {
				packetWriter.clearBuffer();
				var30 = ScriptEvent.method2424();
				var30.clientPacket = null;
				var30.clientPacketLength = 0;
				var30.packetBuffer = new PacketBuffer(5000);
				var30.packetBuffer.writeByte(class325.field3522.field3525);
				packetWriter.addNode(var30);
				packetWriter.flush();
				var2.offset = 0;
				SoundSystem.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var13;
			if (LoginState.READ_LOGIN_STATUS == class33.loginState) {
				if (class132.pcmPlayer1 != null) {
					class132.pcmPlayer1.method750();
				}

				if (((AbstractSocket)var1).isAvailable(1)) {
					var13 = ((AbstractSocket)var1).readUnsignedByte();
					if (class132.pcmPlayer1 != null) {
						class132.pcmPlayer1.method750();
					}

					if (var13 != 0) {
						ClanChannelMember.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					SoundSystem.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (LoginState.READ_RANDOM_VERIFICATION_NUMBER == class33.loginState) {
				if (var2.offset < 8) {
					var13 = ((AbstractSocket)var1).available();
					if (var13 > 8 - var2.offset) {
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var13);
						var2.offset += var13;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					class130.field1520 = var2.readLong();
					SoundSystem.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (LoginState.WRITE_INITIAL_LOGIN_PACKET == class33.loginState) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var29 = new PacketBuffer(500);
				int[] var32 = new int[]{WorldMapIcon_1.field3044.nextInt(), WorldMapIcon_1.field3044.nextInt(), WorldMapIcon_1.field3044.nextInt(), WorldMapIcon_1.field3044.nextInt()};
				var29.offset = 0;
				var29.writeByte(1);
				var29.writeInt(var32[0]);
				var29.writeInt(var32[1]);
				var29.writeInt(var32[2]);
				var29.writeInt(var32[3]);
				var29.writeLong(class130.field1520);
				if (gameState == 40) {
					var29.writeInt(field532[0]);
					var29.writeInt(field532[1]);
					var29.writeInt(field532[2]);
					var29.writeInt(field532[3]);
				} else {
					if (gameState == 50) {
						var29.writeByte(AuthenticationScheme.field1655.rsOrdinal());
						var29.writeInt(class490.field5018);
					} else {
						var29.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
						case 2:
							var29.writeMedium(FadeOutTask.otpMedium);
							++var29.offset;
						case 1:
						default:
							break;
						case 3:
							var29.offset += 4;
							break;
						case 4:
							var29.writeInt(TileItem.clientPreferences.getParameterValue(Login.Login_username));
						}
					}

					if (field545.method9903()) {
						var29.writeByte(class553.field5434.rsOrdinal());
						var29.writeStringCp1252NullTerminated(this.token);
					} else {
						var29.writeByte(class553.field5435.rsOrdinal());
						var29.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var29.encryptRsa(class76.field898, class76.field897);
				field532 = var32;
				PacketBufferNode var6 = ScriptEvent.method2424();
				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(class325.field3523.field3525);
				} else {
					var6.packetBuffer.writeByte(class325.field3521.field3525);
				}

				var6.packetBuffer.writeShort(0);
				int var7 = var6.packetBuffer.offset;
				var6.packetBuffer.writeInt(224);
				var6.packetBuffer.writeInt(1);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field509);
				byte var8 = 0;
				var6.packetBuffer.writeByte(var8);
				var6.packetBuffer.writeBytes(var29.array, 0, var29.offset);
				int var9 = var6.packetBuffer.offset;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(NPC.canvasWidth);
				var6.packetBuffer.writeShort(ApproximateRouteStrategy.canvasHeight);
				class28.randomDatData2(var6.packetBuffer);
				var6.packetBuffer.writeStringCp1252NullTerminated(class433.field4740);
				var6.packetBuffer.writeInt(class318.field3253);
				var6.packetBuffer.writeByte(0);
				Buffer var10 = new Buffer(WorldMapElement.platformInfo.size());
				WorldMapElement.platformInfo.write(var10);
				var6.packetBuffer.writeBytes(var10.array, 0, var10.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				if (class380.field4407) {
					class91.method2432(var6);
				} else {
					Script.method2289(var6);
				}

				var6.packetBuffer.xteaEncrypt(var32, var9, var6.packetBuffer.offset);
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7);
				packetWriter.addNode(var6);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var32);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var32[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				SoundSystem.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var14;
			if (class33.loginState == LoginState.READ_CLIENT_INFO_STATUS && ((AbstractSocket)var1).available() > 0) {
				var13 = ((AbstractSocket)var1).readUnsignedByte();
				if (var13 == 61) {
					var14 = ((AbstractSocket)var1).available();
					class288.field3118 = var14 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1;
					SoundSystem.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var13 == 21 && gameState == 20) {
					SoundSystem.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var13 == 2) {
					if (class380.field4407) {
						SoundSystem.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						SoundSystem.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					SoundSystem.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var13 == 64) {
					SoundSystem.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var13 == 23 && field542 < 1) {
					++field542;
					SoundSystem.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var13 == 29) {
					SoundSystem.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var13 != 69) {
						ClanChannelMember.getLoginError(var13);
						return;
					}

					SoundSystem.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (class33.loginState == LoginState.UNMAPPED_21) {
				class155.field1718 = true;
				GameBuild.method7155(class94.field1143);
				UserComparator3.updateGameState(0);
			}

			if (LoginState.READ_DIGEST_PARSER_PACKET_SIZE == class33.loginState && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				class233.field2459 = var2.readUnsignedShort();
				SoundSystem.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (class33.loginState == LoginState.SUBMIT_DIGEST_PARSER_TASK && ((AbstractSocket)var1).available() >= class233.field2459) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, class233.field2459);
				class6[] var31 = new class6[]{class6.field13};
				class6 var35 = var31[var2.readUnsignedByte()];

				try {
					switch(var35.field10) {
					case 0:
						class0 var33 = new class0();
						this.field563 = new class7(var2, var33);
						SoundSystem.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var16) {
					ClanChannelMember.getLoginError(22);
					return;
				}
			}

			if (class33.loginState == LoginState.WRITE_DIGEST_PARSER_RESULT && this.field563.method51()) {
				this.field507 = this.field563.method43();
				this.field563.method42();
				this.field563 = null;
				if (this.field507 == null) {
					ClanChannelMember.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var30 = ScriptEvent.method2424();
				var30.clientPacket = null;
				var30.clientPacketLength = 0;
				var30.packetBuffer = new PacketBuffer(5000);
				var30.packetBuffer.writeByte(class325.field3520.field3525);
				var30.packetBuffer.writeShort(this.field507.offset);
				var30.packetBuffer.writeBuffer(this.field507);
				packetWriter.addNode(var30);
				packetWriter.flush();
				this.field507 = null;
				SoundSystem.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_STATE_11_PACKET_SIZE == class33.loginState && ((AbstractSocket)var1).available() > 0) {
				class353.field3723 = ((AbstractSocket)var1).readUnsignedByte();
				SoundSystem.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (class33.loginState == LoginState.UNMAPPED_11 && ((AbstractSocket)var1).available() >= class353.field3723) {
				((AbstractSocket)var1).read(var2.array, 0, class353.field3723);
				var2.offset = 0;
				SoundSystem.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (class33.loginState == LoginState.READ_PROFILE_TRANSFER_TIME && ((AbstractSocket)var1).available() > 0) {
				field672 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				SoundSystem.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (class33.loginState == LoginState.PROFILE_TRANSFER) {
				field543 = 0;
				class130.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field672 / 60 + " seconds.");
				if (--field672 <= 0) {
					SoundSystem.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (class33.loginState == LoginState.READ_ACCOUNT_INFO_PACKET_SIZE) {
				var30 = ScriptEvent.method2424();
				var30.clientPacket = null;
				var30.clientPacketLength = 0;
				var30.packetBuffer = new PacketBuffer(5000);
				var30.packetBuffer.writeByte(class325.field3524.field3525);
				var30.packetBuffer.writeShort(class325.field3524.field3528);
				var30.packetBuffer.writeIntLE(VarbitComposition.field2680.hash);
				var30.packetBuffer.writeInt(LoginScreenAnimation.field1281.hash);
				var30.packetBuffer.writeInt(ClientPacket.field3331.hash);
				var30.packetBuffer.writeIntLE(Tile.field1936.hash);
				var30.packetBuffer.writeIntLE(class60.archive4.hash);
				var30.packetBuffer.writeIntLE(Occluder.field2111.hash);
				var30.packetBuffer.writeIntIME(KeyHandler.field100.hash);
				var30.packetBuffer.writeIntIME(SoundSystem.archive2.hash);
				var30.packetBuffer.writeInt(class33.field152.hash);
				var30.packetBuffer.writeInt(FriendsChat.field4909.hash);
				var30.packetBuffer.writeInt(ClientPreferences.archive9.hash);
				var30.packetBuffer.writeIntLE(RestClientThreadFactory.archive12.hash);
				var30.packetBuffer.writeInt(WorldView.field1305.hash);
				var30.packetBuffer.writeIntME(0);
				packetWriter.addNode(var30);
				packetWriter.flush();
				SoundSystem.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (LoginState.UNMAPPED == class33.loginState && ((AbstractSocket)var1).available() >= 1) {
					VarbitComposition.field2687 = ((AbstractSocket)var1).readUnsignedByte();
					if (VarbitComposition.field2687 != class325.field3519.field3528) {
						ClanChannelMember.getLoginError(VarbitComposition.field2687);
						return;
					}

					SoundSystem.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (class33.loginState == LoginState.READ_ACCOUNT_INFO && ((AbstractSocket)var1).available() >= VarbitComposition.field2687) {
					boolean var41 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var40 = false;
					if (var41) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						TileItem.clientPreferences.put(Login.Login_username, var14);
					}

					if (Login_isUsernameRemembered) {
						TileItem.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						TileItem.clientPreferences.updateRememberedUsername((String)null);
					}

					PacketBufferNode.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field630 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					AsyncHttpResponse.method265().method4623(this.https);
					SoundSystem.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (LoginState.SET_SERVER_PROTOCOL == class33.loginState && ((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method9552()) {
						((AbstractSocket)var1).read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var34 = class148.ServerPacket_values();
					var14 = var2.readSmartByteShortIsaac();
					if (var14 < 0 || var14 >= var34.length) {
						throw new IOException("Invalid ServerProt: " + var14 + " at " + var2.offset);
					}

					packetWriter.serverPacket = var34[var14];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var36 = DynamicObject.client;
						JSObject.getWindow(var36).call("zap", (Object[])null);
					} catch (Throwable var15) {
					}

					SoundSystem.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS == class33.loginState) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method8403();
						WorldMapLabelSize.method5528();
						ConcurrentMidiTask.topLevelWorldView.playerUpdateManager.updatePlayer(var2, true);
						class354.entity = class253.localPlayer;
						HttpMethod.field33 = -1;
						Projectile.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field515 = false;
					}

				} else {
					if (class33.loginState == LoginState.UNMAPPED_17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						FriendSystem.field829 = var2.readUnsignedShort();
						SoundSystem.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (class33.loginState == LoginState.UNMAPPED_18 && ((AbstractSocket)var1).available() >= FriendSystem.field829) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, FriendSystem.field829);
						var2.offset = 0;
						String var37 = var2.readStringCp1252NullTerminated();
						String var39 = var2.readStringCp1252NullTerminated();
						String var38 = var2.readStringCp1252NullTerminated();
						class130.setLoginResponseString(var37, var39, var38);
						UserComparator3.updateGameState(10);
						if (field545.method9903()) {
							class532.updateLoginIndex(9);
						}
					}

					if (class33.loginState != LoginState.UNMAPPED_19) {
						++field543;
						if (field543 > 2000) {
							if (field542 < 1) {
								if (VarpDefinition.currentPort == SoundCache.worldPort) {
									VarpDefinition.currentPort = class253.js5Port;
								} else {
									VarpDefinition.currentPort = SoundCache.worldPort;
								}

								++field542;
								SoundSystem.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								ClanChannelMember.getLoginError(-3);
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) {
							if (((AbstractSocket)var1).available() < 2) {
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var13 = packetWriter.serverPacketLength;
							timer.method8423();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1455 = null;
							packetWriter.field1448 = null;
							packetWriter.field1444 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1453 = 0;
							rebootTimer = 0;
							menu.menuOptionsCount = 0;
							isMenuOpen = false;
							minimapState = 0;
							destinationX = 0;
							ConcurrentMidiTask.topLevelWorldView.method2726();
							ItemContainer.itemContainers = new NodeHashTable(32);
							UserComparator3.updateGameState(30);

							for (var14 = 0; var14 < 100; ++var14) {
								validRootWidgets[var14] = true;
							}

							if (packetWriter != null && packetWriter.isaacCipher != null) {
								var30 = class218.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, packetWriter.isaacCipher);
								var30.packetBuffer.writeByte(LoginPacket.getWindowedMode());
								var30.packetBuffer.writeShort(NPC.canvasWidth);
								var30.packetBuffer.writeShort(ApproximateRouteStrategy.canvasHeight);
								packetWriter.addNode(var30);
							}

							ConcurrentMidiTask.topLevelWorldView.playerUpdateManager.updatePlayer(var2, true);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var23) {
			if (field542 < 1) {
				if (SoundCache.worldPort == VarpDefinition.currentPort) {
					VarpDefinition.currentPort = class253.js5Port;
				} else {
					VarpDefinition.currentPort = SoundCache.worldPort;
				}

				++field542;
				SoundSystem.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				ClanChannelMember.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2144561535"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			class275.method5488();
		} else {
			if (!isMenuOpen) {
				DefaultsGroup.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				int var2;
				PacketBufferNode var18;
				while (class161.method3517()) {
					var18 = class218.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var18.packetBuffer.writeByte(0);
					var2 = var18.packetBuffer.offset;
					class238.performReflectionCheck(var18.packetBuffer);
					var18.packetBuffer.writeLengthByte(var18.packetBuffer.offset - var2);
					packetWriter.addNode(var18);
				}

				if (timer.field4839) {
					var18 = class218.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
					var18.packetBuffer.writeByte(0);
					var2 = var18.packetBuffer.offset;
					timer.write(var18.packetBuffer);
					var18.packetBuffer.writeLengthByte(var18.packetBuffer.offset - var2);
					packetWriter.addNode(var18);
					timer.method8404();
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				PacketBuffer var10000;
				synchronized(Friend.mouseRecorder.lock) {
					if (!field776) {
						Friend.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || Friend.mouseRecorder.index >= 40) {
						PacketBufferNode var19 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < Friend.mouseRecorder.index && (var19 == null || var19.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = Friend.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = Friend.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field521 || var8 != field662) {
								if (var19 == null) {
									var19 = class218.getPacketBufferNode(ClientPacket.field3340, packetWriter.isaacCipher);
									var19.packetBuffer.writeByte(0);
									var3 = var19.packetBuffer.offset;
									var10000 = var19.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								if (field523 != -1L) {
									var10 = var9 - field521;
									var11 = var8 - field662;
									var12 = (int)((Friend.mouseRecorder.millis[var7] - field523) / 20L);
									var5 = (int)((long)var5 + (Friend.mouseRecorder.millis[var7] - field523) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field521 = var9;
								field662 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var19.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var19.packetBuffer.writeByte(var12 + 128);
									var19.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var19.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var19.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var19.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var19.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var19.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var19.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field523 = Friend.mouseRecorder.millis[var7];
							}
						}

						if (var19 != null) {
							var19.packetBuffer.writeLengthByte(var19.packetBuffer.offset - var3);
							var7 = var19.packetBuffer.offset;
							var19.packetBuffer.offset = var3;
							var19.packetBuffer.writeByte(var5 / var6);
							var19.packetBuffer.writeByte(var5 % var6);
							var19.packetBuffer.offset = var7;
							packetWriter.addNode(var19);
						}

						if (var4 >= Friend.mouseRecorder.index) {
							Friend.mouseRecorder.index = 0;
						} else {
							MouseRecorder var66 = Friend.mouseRecorder;
							var66.index -= var4;
							System.arraycopy(Friend.mouseRecorder.xs, var4, Friend.mouseRecorder.xs, 0, Friend.mouseRecorder.index);
							System.arraycopy(Friend.mouseRecorder.ys, var4, Friend.mouseRecorder.ys, 0, Friend.mouseRecorder.index);
							System.arraycopy(Friend.mouseRecorder.millis, var4, Friend.mouseRecorder.millis, 0, Friend.mouseRecorder.index);
						}
					}
				}

				if (MouseHandler.MouseHandler_lastButton == 1 || !class429.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var20 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
					if (var20 > 32767L) {
						var20 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > ApproximateRouteStrategy.canvasHeight) {
						var3 = ApproximateRouteStrategy.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > NPC.canvasWidth) {
						var4 = NPC.canvasWidth;
					}

					var5 = (int)var20;
					PacketBufferNode var22 = class218.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
					var22.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
					var22.packetBuffer.writeShort(var4);
					var22.packetBuffer.writeShort(var3);
					packetWriter.addNode(var22);
				}

				if (mouseWheelRotation != 0) {
					var18 = class218.getPacketBufferNode(ClientPacket.field3359, packetWriter.isaacCipher);
					var18.packetBuffer.writeShort(mouseWheelRotation);
					packetWriter.addNode(var18);
				}

				if (indexCheck.field2918 > 0) {
					var18 = class218.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
					var18.packetBuffer.writeShort(0);
					var2 = var18.packetBuffer.offset;
					long var23 = RouteStrategy.method5439();

					for (var5 = 0; var5 < indexCheck.field2918; ++var5) {
						long var25 = var23 - field676;
						if (var25 > 16777215L) {
							var25 = 16777215L;
						}

						field676 = var23;
						var18.packetBuffer.writeMedium((int)var25);
						var18.packetBuffer.writeByteAdd(indexCheck.field2920[var5]);
					}

					var18.packetBuffer.writeLengthShort(var18.packetBuffer.offset - var2);
					packetWriter.addNode(var18);
				}

				if (field777 > 0) {
					--field777;
				}

				if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
					field606 = true;
				}

				if (field606 && field777 <= 0) {
					field777 = 20;
					field606 = false;
					var18 = class218.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
					var18.packetBuffer.writeShortAddLE(camAngleY);
					var18.packetBuffer.writeShort(camAngleX);
					packetWriter.addNode(var18);
				}

				if (class327.hasFocus && !hadFocus) {
					hadFocus = true;
					var18 = class218.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var18.packetBuffer.writeByte(1);
					packetWriter.addNode(var18);
				}

				if (!class327.hasFocus && hadFocus) {
					hadFocus = false;
					var18 = class218.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var18.packetBuffer.writeByte(0);
					packetWriter.addNode(var18);
				}

				if (class219.worldMap != null) {
					class219.worldMap.method9197();
				}

				class419.method7762();
				class153.method3385();
				if (field742 != ConcurrentMidiTask.topLevelWorldView.plane) {
					field742 = ConcurrentMidiTask.topLevelWorldView.plane;
					class163.method3528(ConcurrentMidiTask.topLevelWorldView.plane);
				}

				if (gameState == 30) {
					Decimator.method1096(ConcurrentMidiTask.topLevelWorldView);

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) {
						var10002 = queuedSoundEffectDelays[var1]--;
						if (queuedSoundEffectDelays[var1] >= -10) {
							SoundEffect var44 = soundEffects[var1];
							if (var44 == null) {
								var10000 = null;
								var44 = SoundEffect.readSoundEffect(Projectile.soundEffectsArchive, soundEffectIds[var1], 0);
								if (var44 == null) {
									continue;
								}

								int[] var67 = queuedSoundEffectDelays;
								var67[var1] += var44.calculateDelay();
								soundEffects[var1] = var44;
							}

							if (queuedSoundEffectDelays[var1] < 0) {
								if (soundLocations[var1] != 0) {
									var4 = (soundLocations[var1] & 255) * 128;
									var5 = soundLocations[var1] >> 16 & 255;
									var6 = Math.abs(class378.method7167(var5) - class253.localPlayer.x);
									var7 = soundLocations[var1] >> 8 & 255;
									var8 = Math.abs(class378.method7167(var7) - class253.localPlayer.y);
									var9 = Math.max(var6 + var8 - 128, 0);
									var10 = Math.max(((field756[var1] & 31) - 1) * 128, 0);
									if (var9 >= var4) {
										queuedSoundEffectDelays[var1] = -100;
										continue;
									}

									float var42 = var10 < var4 ? Math.min(Math.max((float)(var4 - var9) / (float)(var4 - var10), 0.0F), 1.0F) : 1.0F;
									var3 = (int)(var42 * (float)TileItem.clientPreferences.getAreaSoundEffectsVolume());
								} else {
									var3 = TileItem.clientPreferences.getSoundEffectsVolume();
								}

								if (var3 > 0) {
									RawSound var27 = var44.toRawSound().resample(class343.decimator);
									RawPcmStream var28 = RawPcmStream.createRawPcmStream(var27, 100, var3);
									var28.setNumLoops(queuedSoundEffectLoops[var1] - 1);
									ScriptFrame.pcmStreamMixer.addSubStream(var28);
								}

								queuedSoundEffectDelays[var1] = -100;
							}
						} else {
							--soundEffectCount;

							for (var2 = var1; var2 < soundEffectCount; ++var2) {
								soundEffectIds[var2] = soundEffectIds[var2 + 1];
								soundEffects[var2] = soundEffects[var2 + 1];
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1];
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1];
								soundLocations[var2] = soundLocations[var2 + 1];
								field756[var2] = field756[var2 + 1];
							}

							--var1;
						}
					}

					if (playingJingle && !PlayerCompositionColorTextureOverride.method4752()) {
						if (TileItem.clientPreferences.getMusicVolume() != 0) {
							boolean var37 = !class332.field3565.isEmpty();
							if (var37) {
								UserComparator8.method3052(class33.archive6, TileItem.clientPreferences.getMusicVolume());
							}
						}

						playingJingle = false;
					}

					++packetWriter.field1453;
					if (packetWriter.field1453 > 750) {
						class275.method5488();
					} else {
						WorldView var43 = ConcurrentMidiTask.topLevelWorldView;
						var2 = var43.playerUpdateManager.playerCount;
						int[] var29 = var43.playerUpdateManager.playerIndices;

						for (var4 = 0; var4 < var2; ++var4) {
							Player var52 = var43.players[var29[var4]];
							if (var52 != null) {
								WorldMapIcon_0.updateActorSequence(var43, var52, 1);
							}
						}

						WorldView var45 = ConcurrentMidiTask.topLevelWorldView;

						for (var3 = 0; var3 < var45.npcCount; ++var3) {
							var4 = var45.npcIndices[var3];
							NPC var53 = var45.npcs[var4];
							if (var53 != null) {
								WorldMapIcon_0.updateActorSequence(var45, var53, var53.definition.size);
							}
						}

						MoveSpeed.method5484(ConcurrentMidiTask.topLevelWorldView);
						SceneTilePaint.method4377(ConcurrentMidiTask.topLevelWorldView);

						Player var31;
						for (var3 = 0; var3 < ConcurrentMidiTask.topLevelWorldView.worldEntityCount; ++var3) {
							WorldEntity var50 = ConcurrentMidiTask.topLevelWorldView.worldEntities[ConcurrentMidiTask.topLevelWorldView.worldEntityIndices[var3]];
							if (var50 != null) {
								Decimator.method1096(var50.worldView);
								WorldView var54 = var50.worldView;
								var6 = var54.playerUpdateManager.playerCount;
								int[] var30 = var54.playerUpdateManager.playerIndices;

								for (var8 = 0; var8 < var6; ++var8) {
									var31 = var54.players[var30[var8]];
									if (var31 != null) {
										WorldMapIcon_0.updateActorSequence(var54, var31, 1);
									}
								}

								WorldView var46 = var50.worldView;

								for (var7 = 0; var7 < var46.npcCount; ++var7) {
									var8 = var46.npcIndices[var7];
									NPC var60 = var46.npcs[var8];
									if (var60 != null) {
										WorldMapIcon_0.updateActorSequence(var46, var60, var60.definition.size);
									}
								}

								SceneTilePaint.method4377(var50.worldView);
							}
						}

						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var55 = HttpMethod.mousedOverWidgetIf1;
						Widget var51 = class273.field2978;
						HttpMethod.mousedOverWidgetIf1 = null;
						class273.field2978 = null;
						draggedOnWidget = null;
						field604 = false;
						field683 = false;
						field736 = 0;

						while (indexCheck.method5375() && field736 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field2930 == 66) {
								StringBuilder var47 = new StringBuilder();

								Message var32;
								for (Iterator var58 = Messages.Messages_hashTable.iterator(); var58.hasNext(); var47.append(var32.text).append('\n')) {
									var32 = (Message)var58.next();
									if (var32.sender != null && !var32.sender.isEmpty()) {
										var47.append(var32.sender).append(':');
									}
								}

								String var56 = var47.toString();
								DynamicObject.client.method457(var56);
							} else if (oculusOrbState != 1 || indexCheck.field2931 <= 0) {
								field651[field736] = indexCheck.field2930;
								field737[field736] = indexCheck.field2931;
								++field736;
							}
						}

						if (class276.method5505() && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var5 = class253.localPlayer.plane - mouseWheelRotation;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > 3) {
								var5 = 3;
							}

							if (var5 != class253.localPlayer.plane) {
								FloorDecoration.method3717(class253.localPlayer.pathX[0] + ConcurrentMidiTask.topLevelWorldView.baseX, class253.localPlayer.pathY[0] + ConcurrentMidiTask.topLevelWorldView.baseY, var5, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							Actor.updateRootInterface(rootInterface, 0, 0, NPC.canvasWidth, ApproximateRouteStrategy.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var48;
							ScriptEvent var57;
							Widget var59;
							do {
								var57 = (ScriptEvent)scriptEvents2.removeLast();
								if (var57 == null) {
									while (true) {
										do {
											var57 = (ScriptEvent)scriptEvents3.removeLast();
											if (var57 == null) {
												while (true) {
													do {
														var57 = (ScriptEvent)scriptEvents.removeLast();
														if (var57 == null) {
															boolean var39 = false;

															while (true) {
																class266 var49 = (class266)field712.removeLast();
																if (var49 == null) {
																	if (!var39 && MouseHandler.MouseHandler_lastButton == 1) {
																		field735.method5345();
																	}

																	this.menu();
																	World.method1929();
																	if (clickedWidget != null) {
																		this.method1248();
																	}

																	boolean var38 = false;

																	for (var7 = 0; var7 < ConcurrentMidiTask.topLevelWorldView.worldEntityCount; ++var7) {
																		WorldEntity var63 = ConcurrentMidiTask.topLevelWorldView.worldEntities[ConcurrentMidiTask.topLevelWorldView.worldEntityIndices[var7]];
																		WorldView var61 = var63.worldView;
																		Scene var33 = var61.scene;
																		if (var63 != null && var33.shouldSendWalk()) {
																			if (!var38) {
																				var11 = var33.baseX;
																				var12 = var33.baseY;
																				PacketBufferNode var13 = class218.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																				var13.packetBuffer.writeByte(5);
																				var13.packetBuffer.writeByte(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																				var13.packetBuffer.writeShortLE(var12 + var61.baseY);
																				var13.packetBuffer.writeShort(var11 + var61.baseX);
																				packetWriter.addNode(var13);
																				var38 = true;
																				mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																				mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																				mouseCrossColor = 1;
																				mouseCrossState = 0;
																				destinationX = var11;
																				destinationY = var12;
																			}

																			var33.method3946();
																		}
																	}

																	if (!var38 && ConcurrentMidiTask.topLevelWorldView.scene.shouldSendWalk()) {
																		var7 = ConcurrentMidiTask.topLevelWorldView.scene.baseX;
																		var8 = ConcurrentMidiTask.topLevelWorldView.scene.baseY;
																		PacketBufferNode var62 = class218.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																		var62.packetBuffer.writeByte(5);
																		var62.packetBuffer.writeByte(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																		var62.packetBuffer.writeShortLE(var8 + ConcurrentMidiTask.topLevelWorldView.baseY);
																		var62.packetBuffer.writeShort(var7 + ConcurrentMidiTask.topLevelWorldView.baseX);
																		packetWriter.addNode(var62);
																		ConcurrentMidiTask.topLevelWorldView.scene.method3946();
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																		mouseCrossColor = 1;
																		mouseCrossState = 0;
																		destinationX = var7;
																		destinationY = var8;
																	}

																	if (var38) {
																		ConcurrentMidiTask.topLevelWorldView.scene.method3946();
																	}

																	if (var55 != HttpMethod.mousedOverWidgetIf1) {
																		if (var55 != null) {
																			class416.invalidateWidget(var55);
																		}

																		if (HttpMethod.mousedOverWidgetIf1 != null) {
																			class416.invalidateWidget(HttpMethod.mousedOverWidgetIf1);
																		}
																	}

																	if (var51 != class273.field2978 && field657 == field656) {
																		if (var51 != null) {
																			class416.invalidateWidget(var51);
																		}

																		if (class273.field2978 != null) {
																			class416.invalidateWidget(class273.field2978);
																		}
																	}

																	if (class273.field2978 != null) {
																		if (field656 < field657) {
																			++field656;
																			if (field656 == field657) {
																				class416.invalidateWidget(class273.field2978);
																			}
																		}
																	} else if (field656 > 0) {
																		--field656;
																	}

																	if (oculusOrbState == 0) {
																		var7 = class354.entity.getX();
																		var8 = class354.entity.getY();
																		if (field634 != -1) {
																			var31 = class253.localPlayer.worldView.players[field634];
																			if (var31 != null) {
																				Coord var64 = var31.method2531(class253.localPlayer.worldView);
																				var7 = var64.x;
																				var8 = var64.y;
																			}
																		}

																		var9 = class354.entity.getPlane();
																		if (class130.oculusOrbFocalPointX - var7 < -500 || class130.oculusOrbFocalPointX - var7 > 500 || class499.oculusOrbFocalPointY - var8 < -500 || class499.oculusOrbFocalPointY - var8 > 500) {
																			class130.oculusOrbFocalPointX = var7;
																			class499.oculusOrbFocalPointY = var8;
																		}

																		if (var7 != class130.oculusOrbFocalPointX) {
																			class130.oculusOrbFocalPointX += (var7 - class130.oculusOrbFocalPointX) / 16;
																		}

																		if (var8 != class499.oculusOrbFocalPointY) {
																			class499.oculusOrbFocalPointY += (var8 - class499.oculusOrbFocalPointY) / 16;
																		}

																		var10 = class130.oculusOrbFocalPointX >> 7;
																		var11 = class499.oculusOrbFocalPointY >> 7;
																		var12 = class162.getTileHeight(ConcurrentMidiTask.topLevelWorldView, class130.oculusOrbFocalPointX, class499.oculusOrbFocalPointY, var9);
																		int var34 = 0;
																		int var14;
																		if (var10 > 3 && var11 > 3 && var10 < 100 && var11 < 100) {
																			for (var14 = var10 - 4; var14 <= var10 + 4; ++var14) {
																				for (int var15 = var11 - 4; var15 <= var11 + 4; ++var15) {
																					int var16 = var9;
																					if (var9 < 3 && (ConcurrentMidiTask.topLevelWorldView.tileSettings[1][var14][var15] & 2) == 2) {
																						var16 = var9 + 1;
																					}

																					int var17 = var12 - ConcurrentMidiTask.topLevelWorldView.tileHeights[var16][var14][var15];
																					if (var17 > var34) {
																						var34 = var17;
																					}
																				}
																			}
																		}

																		var14 = var34 * 192;
																		if (var14 > 98048) {
																			var14 = 98048;
																		}

																		if (var14 < 32768) {
																			var14 = 32768;
																		}

																		if (var14 > field501) {
																			field501 += (var14 - field501) / 24;
																		} else if (var14 < field501) {
																			field501 += (var14 - field501) / 80;
																		}

																		Actor.oculusOrbFocalPointZ = class162.getTileHeight(ConcurrentMidiTask.topLevelWorldView, var7, var8, var9) - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		if (field632 && class253.localPlayer != null) {
																			var7 = class253.localPlayer.pathX[0];
																			var8 = class253.localPlayer.pathY[0];
																			if (var7 >= 0 && 104 > var7 && var8 >= 0 && 104 > var8) {
																				class130.oculusOrbFocalPointX = class253.localPlayer.x;
																				var9 = class162.getTileHeight(ConcurrentMidiTask.topLevelWorldView, class253.localPlayer.x, class253.localPlayer.y, ConcurrentMidiTask.topLevelWorldView.plane) - camFollowHeight;
																				if (var9 < Actor.oculusOrbFocalPointZ) {
																					Actor.oculusOrbFocalPointZ = var9;
																				}

																				class499.oculusOrbFocalPointY = class253.localPlayer.y;
																				field632 = false;
																			}
																		}

																		short var40 = -1;
																		if (indexCheck.isValidIndexInRange(33)) {
																			var40 = 0;
																		} else if (indexCheck.isValidIndexInRange(49)) {
																			var40 = 1024;
																		}

																		if (indexCheck.isValidIndexInRange(48)) {
																			if (var40 == 0) {
																				var40 = 1792;
																			} else if (var40 == 1024) {
																				var40 = 1280;
																			} else {
																				var40 = 1536;
																			}
																		} else if (indexCheck.isValidIndexInRange(50)) {
																			if (var40 == 0) {
																				var40 = 256;
																			} else if (var40 == 1024) {
																				var40 = 768;
																			} else {
																				var40 = 512;
																			}
																		}

																		byte var41 = 0;
																		if (indexCheck.isValidIndexInRange(35)) {
																			var41 = -1;
																		} else if (indexCheck.isValidIndexInRange(51)) {
																			var41 = 1;
																		}

																		var9 = 0;
																		if (var40 >= 0 || var41 != 0) {
																			var9 = indexCheck.isValidIndexInRange(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var9 *= 16;
																			field502 = var40;
																			field681 = var41;
																		}

																		if (field598 < var9) {
																			field598 += var9 / 8;
																			if (field598 > var9) {
																				field598 = var9;
																			}
																		} else if (field598 > var9) {
																			field598 = field598 * 9 / 10;
																		}

																		if (field598 > 0) {
																			var10 = field598 / 16;
																			if (field502 >= 0) {
																				var7 = field502 - class264.cameraYaw & 2047;
																				var11 = Rasterizer3D.Rasterizer3D_sine[var7];
																				var12 = Rasterizer3D.Rasterizer3D_cosine[var7];
																				class130.oculusOrbFocalPointX += var10 * var11 / 65536;
																				class499.oculusOrbFocalPointY += var10 * var12 / 65536;
																			}

																			if (field681 != 0) {
																				Actor.oculusOrbFocalPointZ += var10 * field681;
																				if (Actor.oculusOrbFocalPointZ > 0) {
																					Actor.oculusOrbFocalPointZ = 0;
																				}
																			}
																		} else {
																			field502 = -1;
																			field681 = -1;
																		}

																		if (indexCheck.isValidIndexInRange(13)) {
																			AsyncHttpResponse.method247();
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && class429.mouseCam) {
																		var7 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																		camAngleDX = var7 * 2;
																		mouseCamClickedY = var7 != -1 && var7 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
																		var8 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																		camAngleDY = var8 * 2;
																		mouseCamClickedX = var8 != -1 && var8 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
																	} else {
																		if (indexCheck.isValidIndexInRange(96)) {
																			camAngleDY += (-24 - camAngleDY) / 2;
																		} else if (indexCheck.isValidIndexInRange(97)) {
																			camAngleDY += (24 - camAngleDY) / 2;
																		} else {
																			camAngleDY /= 2;
																		}

																		if (indexCheck.isValidIndexInRange(98)) {
																			camAngleDX += (12 - camAngleDX) / 2;
																		} else if (indexCheck.isValidIndexInRange(99)) {
																			camAngleDX += (-12 - camAngleDX) / 2;
																		} else {
																			camAngleDX /= 2;
																		}

																		mouseCamClickedY = MouseHandler.MouseHandler_y;
																		mouseCamClickedX = MouseHandler.MouseHandler_x;
																	}

																	camAngleY = camAngleDY / 2 + camAngleY & 2047;
																	camAngleX += camAngleDX / 2;
																	if (camAngleX < 128) {
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) {
																		camAngleX = 383;
																	}

																	if (field765) {
																		TilesProjection.method4123();
																	} else if (isCameraLocked) {
																		class400.method7483();
																	}

																	for (var7 = 0; var7 < 5; ++var7) {
																		var10002 = field770[var7]++;
																	}

																	ObjectComposition.varcs.tryWrite();
																	var7 = ++MouseHandler.MouseHandler_idleCycles - 1;
																	var9 = class319.method6151();
																	PacketBufferNode var65;
																	if (var7 > 15000 && var9 > 15000) {
																		logoutTimer = 250;
																		WorldMapRenderer.method5788(14500);
																		var65 = class218.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var65);
																	}

																	class277.friendSystem.processFriendUpdates();
																	HealthBarDefinition.method4865();
																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var65 = class218.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var65);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var35) {
																		class275.method5488();
																	}

																	AsyncHttpResponse.method265().method4648();
																	return;
																}

																if (var49.field2915.type == 12) {
																	var39 = true;
																}

																ClientPacket.method6154(var49);
															}
														}

														var48 = var57.widget;
														if (var48.childIndex < 0) {
															break;
														}

														var59 = FloorUnderlayDefinition.widgetDefinition.method6544(var48.parentId);
													} while(var59 == null || var59.children == null || var48.childIndex >= var59.children.length || var48 != var59.children[var48.childIndex]);

													class421.runScriptEvent(var57);
												}
											}

											var48 = var57.widget;
											if (var48.childIndex < 0) {
												break;
											}

											var59 = FloorUnderlayDefinition.widgetDefinition.method6544(var48.parentId);
										} while(var59 == null || var59.children == null || var48.childIndex >= var59.children.length || var48 != var59.children[var48.childIndex]);

										class421.runScriptEvent(var57);
									}
								}

								var48 = var57.widget;
								if (var48.childIndex < 0) {
									break;
								}

								var59 = FloorUnderlayDefinition.widgetDefinition.method6544(var48.parentId);
							} while(var59 == null || var59.children == null || var48.childIndex >= var59.children.length || var48 != var59.children[var48.childIndex]);

							class421.runScriptEvent(var57);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "63325519"
	)
	public void vmethod6445(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && TileItem.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = class218.getPacketBufferNode(ClientPacket.field3266, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = NPC.canvasWidth;
		int var2 = ApproximateRouteStrategy.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (TileItem.clientPreferences != null) {
			try {
				Client var3 = DynamicObject.client;
				Object[] var4 = new Object[]{LoginPacket.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			class155.method3411(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field685[var1] = true;
			}

			field763[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field686 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class76.drawWidgets(rootInterface, 0, 0, NPC.canvasWidth, ApproximateRouteStrategy.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				MusicSong.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				MusicSong.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				int var2 = viewportY;
				if ((menu.menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					int var3 = menu.menuOptionsCount - 1;
					String var5;
					if (isItemSelected == 1 && menu.menuOptionsCount < 2) {
						var5 = "Use" + " " + field659 + " " + "->";
					} else if (isSpellSelected && menu.menuOptionsCount < 2) {
						var5 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var5 = menu.method10250(var3);
					}

					if (menu.menuOptionsCount > 2) {
						var5 = var5 + TransformationMatrix.colorStartTag(16777215) + " " + '/' + " " + (menu.menuOptionsCount - 2) + " more options";
					}

					WorldMapLabelSize.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			menu.method10272();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field763[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field685[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		MusicPatch.method6438(ConcurrentMidiTask.topLevelWorldView.plane, class253.localPlayer.x, class253.localPlayer.y, graphicsCycle);
		graphicsCycle = 0;
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Leq;IB)Z",
		garbageValue = "3"
	)
	boolean method1217(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			HttpRequestTask.friendsChat = null;
		} else {
			if (HttpRequestTask.friendsChat == null) {
				HttpRequestTask.friendsChat = new FriendsChat(ObjectSound.loginType, DynamicObject.client);
			}

			HttpRequestTask.friendsChat.method8568(var1.packetBuffer, var2);
		}

		ItemContainer.method2388();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)Z",
		garbageValue = "-661603132"
	)
	boolean method1723(PacketWriter var1) {
		if (HttpRequestTask.friendsChat != null) {
			HttpRequestTask.friendsChat.method8558(var1.packetBuffer);
		}

		ItemContainer.method2388();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)Z",
		garbageValue = "-1557555107"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var24;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1452) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1453 = 0;
						var1.field1452 = false;
					}

					var3.offset = 0;
					if (var3.method9552()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1453 = 0;
					}

					var1.field1452 = true;
					ServerPacket[] var4 = class148.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1453 = 0;
				timer.method8417();
				var1.field1444 = var1.field1448;
				var1.field1448 = var1.field1455;
				var1.field1455 = var1.serverPacket;
				int var20;
				if (ServerPacket.field3465 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					var6 = class546.field5371 >= 223 ? var3.readShort() : -1;
					this.method588(false);
					if (var20 == 0) {
						class354.entity = ConcurrentMidiTask.topLevelWorldView.players[var5];
						field634 = -1;
						if (ConcurrentMidiTask.topLevelWorldView != class253.localPlayer.worldView) {
							ConcurrentMidiTask.topLevelWorldView.scene.method3926(class173.field1824);
							class253.localPlayer.worldView = ConcurrentMidiTask.topLevelWorldView;
						}
					} else if (var20 == 1) {
						field634 = -1;
						class354.entity = ConcurrentMidiTask.topLevelWorldView.npcs[var5];
					} else if (var20 == 2) {
						field634 = var6;
						class354.entity = ConcurrentMidiTask.topLevelWorldView.worldEntities[var5];
						this.method588(true);
						if (ConcurrentMidiTask.topLevelWorldView.worldEntities[var5].worldView != class253.localPlayer.worldView) {
							ConcurrentMidiTask.topLevelWorldView.scene.method3926(class173.field1823);
							class253.localPlayer.worldView = ConcurrentMidiTask.topLevelWorldView.worldEntities[var5].worldView;
						}
					}

					if (class354.entity == null) {
						field634 = -1;
						class354.entity = class253.localPlayer;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3514 == var1.serverPacket) {
					class328.worldView.npcCount = 0;
					class328.worldView.worldEntityCount = 0;

					for (var20 = 0; var20 < 65536; ++var20) {
						class328.worldView.npcs[var20] = null;
					}

					for (var20 = 0; var20 < 2048; ++var20) {
						class328.worldView.worldEntities[var20] = null;
					}

					ConcurrentMidiTask.topLevelWorldView.scene.method3926(class173.field1824);
					class253.localPlayer.worldView = ConcurrentMidiTask.topLevelWorldView;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntLE();
					Varps.Varps_temp[var20] = var5;
					if (Varps.Varps_main[var20] != var5) {
						Varps.Varps_main[var20] = var5;
					}

					class59.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var8;
				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					UrlRequester.method3003();
					var20 = var3.readInt();
					var5 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedByteNeg();
					var7 = var3.readUnsignedByteAdd();
					experience[var7] = var20;
					currentLevels[var7] = var6;
					levels[var7] = 1;
					field647[var7] = var5;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var20 >= Skills.Skills_experienceTable[var8]) {
							levels[var7] = var8 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var7;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HINT_ARROW == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 4096;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 8192;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 4096;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 4096;
							hintArrowSubY = 8192;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte() * 4;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var86;
				if (ServerPacket.field3476 == var1.serverPacket) {
					var86 = var3.readUnsignedByte() == 1;
					if (var86) {
						SpriteMask.field3697 = RouteStrategy.method5439() - var3.readLong();
						SwapSongTask.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						SwapSongTask.grandExchangeEvents = null;
					}

					field705 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				boolean var67;
				String var69;
				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var20 = var3.readUShortSmart();
					var67 = var3.readUnsignedByte() == 1;
					var69 = "";
					boolean var65 = false;
					if (var67) {
						var69 = var3.readStringCp1252NullTerminated();
						if (class277.friendSystem.isIgnored(new Username(var69, ObjectSound.loginType))) {
							var65 = true;
						}
					}

					String var79 = var3.readStringCp1252NullTerminated();
					if (!var65) {
						class269.addGameMessage(var20, var69, var79);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field765 = false;
					isCameraLocked = false;
					field759 = false;
					field760 = false;
					class156.field1721 = 0;
					class222.field2417 = 0;
					Language.field4602 = 0;
					field514 = false;
					NPCComposition.field2613 = 0;
					Message.field461 = 0;
					FriendSystem.field827 = 0;
					LoginState.field500 = 0;
					class166.field1793 = 0;
					class329.field3545 = 0;
					Renderable.field2086 = 0;
					field762 = null;
					field615 = null;
					field517 = null;

					for (var20 = 0; var20 < 5; ++var20) {
						field764[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3464 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					ArchiveDisk.queueSoundEffect(var20, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				Widget var76;
				if (ServerPacket.field3473 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedIntLE();
					var76 = FloorUnderlayDefinition.widgetDefinition.method6544(var6);
					var76.field3861.method6589(var5, var20);
					class416.invalidateWidget(var76);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field765 = false;
					field760 = true;
					var20 = GrandExchangeOffer.method7429(var3.readShort() & 2027);
					var5 = class223.method4708(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field615 = new class511(UserComparator6.cameraPitch, var5, var6, var7);
					field517 = new class511(class264.cameraYaw, var20, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3389 == var1.serverPacket) {
					SoundSystem.method820(class322.field3370);
					var1.serverPacket = null;
					return true;
				}

				byte var66;
				if (ServerPacket.field3391 == var1.serverPacket) {
					field562 = cycleCntr;
					var66 = var3.readByte();
					class165 var90 = new class165(var3);
					ClanChannel var91;
					if (var66 >= 0) {
						var91 = currentClanChannels[var66];
					} else {
						var91 = class47.guestClanChannel;
					}

					if (var91 == null) {
						this.method1250(var66);
						var1.serverPacket = null;
						return true;
					}

					if (var90.field1784 > var91.field1803) {
						this.method1250(var66);
						var1.serverPacket = null;
						return true;
					}

					if (var90.field1784 < var91.field1803) {
						var1.serverPacket = null;
						return true;
					}

					var90.method3554(var91);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3512 == var1.serverPacket) {
					class105.field1355 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					Projectile.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3501 == var1.serverPacket) {
					SoundSystem.method820(class322.field3365);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3432 == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShortAdd();
					class92.method2440(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var21;
				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShortAddLE();
					var21 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					if (var21.modelType != 2 || var5 != var21.modelId) {
						var21.modelType = 2;
						var21.modelId = var5;
						class416.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var20 = var3.readInt();
					InterfaceParent var89 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var89 != null) {
						class59.closeInterface(var89, true);
					}

					if (meslayerContinueWidget != null) {
						class416.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3396 == var1.serverPacket) {
					var20 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedIntIME();
					var21 = FloorUnderlayDefinition.widgetDefinition.method6544(var5);
					var21.field3861.method6587(class253.localPlayer.appearance.gender, var20);
					class416.invalidateWidget(var21);
					var1.serverPacket = null;
					return true;
				}

				int var9;
				int var10;
				int var61;
				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var10 = var3.readUnsignedByte();
					var9 = var3.readUnsignedShortAddLE();
					var61 = var3.readUnsignedShortLE();
					var6 = var3.method9694();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					if (var7 >= 0 && var8 >= 0 && var7 < class328.worldView.sizeX && var8 < class328.worldView.sizeY) {
						var7 = class378.method7167(var7);
						var8 = class378.method7167(var8);
						GraphicsObject var60 = new GraphicsObject(var9, class328.worldView.plane, var7, var8, class162.getTileHeight(class328.worldView, var7, var8, class328.worldView.plane) - var10, var61, cycle);
						class328.worldView.graphicsObjects.addFirst(var60);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var20 = var3.readShortLE();
					var5 = var3.method9651();
					var6 = var3.readInt();
					var76 = FloorUnderlayDefinition.widgetDefinition.method6544(var6);
					if (var20 != var76.rawX || var5 != var76.rawY || var76.xAlignment != 0 || var76.yAlignment != 0) {
						var76.rawX = var20;
						var76.rawY = var5;
						var76.xAlignment = 0;
						var76.yAlignment = 0;
						class416.invalidateWidget(var76);
						this.alignWidget(var76);
						if (var76.type == 0) {
							class165.revalidateWidgetScroll(FloorUnderlayDefinition.widgetDefinition.Widget_interfaceComponents[var6 >> 16], var76, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var21 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					} else {
						var21 = null;
					}

					if (var21 != null) {
						for (var7 = 0; var7 < var21.itemIds.length; ++var7) {
							var21.itemIds[var7] = 0;
							var21.itemQuantities[var7] = 0;
						}
					}

					GrandExchangeOfferTotalQuantityComparator.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var3.readUnsignedByteSub();
						if (var9 == 255) {
							var9 = var3.readInt();
						}

						var10 = var3.readUnsignedShortLE();
						if (var21 != null && var8 < var21.itemIds.length) {
							var21.itemIds[var8] = var10;
							var21.itemQuantities[var8] = var9;
						}

						class363.itemContainerSetItem(var5, var8, var10 - 1, var9);
					}

					if (var21 != null) {
						class416.invalidateWidget(var21);
					}

					UrlRequester.method3003();
					changedItemContainers[++field572 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var21 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					} else {
						var21 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class363.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var9 = 0;
						if (var8 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var21 != null && var7 >= 0 && var7 < var21.itemIds.length) {
							var21.itemIds[var7] = var8;
							var21.itemQuantities[var7] = var9;
						}
					}

					if (var21 != null) {
						class416.invalidateWidget(var21);
					}

					UrlRequester.method3003();
					changedItemContainers[++field572 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3394 == var1.serverPacket) {
					return this.method1217(var1, 2);
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_main[var20] != Varps.Varps_temp[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							class59.changeGameOptions(var20);
							changedVarps[++changedVarpCount - 1 & 31] = var20;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3517 == var1.serverPacket) {
					Buddy.field4934 = new class487(class373.field4034);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3508 == var1.serverPacket) {
					Tiles.updateWorldEntitiesFromPacketBuffer(class328.worldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3447 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedIntLE();
					var21 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					var21.field3861.method6590(var5);
					class416.invalidateWidget(var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var6 = var3.readUnsignedByteAdd();
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var83 = class328.worldView.npcs[var20];
					if (var83 != null) {
						if (var5 == var83.sequence && var5 != -1) {
							var8 = class182.SequenceDefinition_get(var5).restartMode;
							if (var8 == 1) {
								var83.sequenceFrame = 0;
								var83.sequenceFrameCycle = 0;
								var83.sequenceDelay = var6;
								var83.field1228 = 0;
							} else if (var8 == 2) {
								var83.field1228 = 0;
							}
						} else if (var5 == -1 || var83.sequence == -1 || class182.SequenceDefinition_get(var5).field2867 >= class182.SequenceDefinition_get(var83.sequence).field2867) {
							var83.sequence = var5;
							var83.sequenceFrame = 0;
							var83.sequenceFrameCycle = 0;
							var83.sequenceDelay = var6;
							var83.field1228 = 0;
							var83.field1255 = var83.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3505 == var1.serverPacket) {
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedShort();
					var8 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedShortAdd();
					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					ArrayList var80 = new ArrayList();
					var80.add(var20);
					class169.method3599(var80, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3493 == var1.serverPacket) {
					if (Buddy.field4934 == null) {
						Buddy.field4934 = new class487(class373.field4034);
					}

					class557 var54 = class373.field4034.method8872(var3);
					Buddy.field4934.field5016.vmethod9334(var54.field5444, var54.field5445);
					field697[++field698 - 1 & 31] = var54.field5444;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3437 == var1.serverPacket) {
					SoundSystem.method820(class322.field3362);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3515 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedByte();
					if (var20 == 0) {
						ConcurrentMidiTask.topLevelWorldView.plane = var6;
						class328.worldView = ConcurrentMidiTask.topLevelWorldView;
					} else {
						if (var20 != 1) {
							throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
						}

						WorldEntity var81 = ConcurrentMidiTask.topLevelWorldView.worldEntities[var5];
						var81.worldView.plane = var6;
						class328.worldView = var81.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3436 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					rootInterface = var20;
					this.method1246(false);
					class499.method8953(var20);
					class297.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3443 == var1.serverPacket) {
					SoundSystem.method820(class322.field3368);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3449 == var1.serverPacket) {
					for (var20 = 0; var20 < class328.worldView.players.length; ++var20) {
						if (class328.worldView.players[var20] != null) {
							class328.worldView.players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < class328.worldView.npcs.length; ++var20) {
						if (class328.worldView.npcs[var20] != null) {
							class328.worldView.npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					tradeChatMode = var3.readUnsignedByteSub();
					publicChatMode = var3.readUnsignedByteAdd();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < VarpDefinition.field2453; ++var20) {
						VarpDefinition var88 = GrandExchangeOffer.VarpDefinition_get(var20);
						if (var88 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}

					UrlRequester.method3003();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				NPC var73;
				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var7 = var3.readUnsignedByte();
					var20 = var3.readUnsignedShortAddLE();
					var73 = class328.worldView.npcs[var20];
					var6 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntME();
					if (var73 != null) {
						var73.updateSpotAnimation(var7, var6, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				int var26;
				byte var58;
				byte var59;
				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var13 = var3.readUnsignedByteNeg() * 4;
					var58 = var3.readByte();
					var18 = var3.readUnsignedShortLE();
					var17 = var3.readUnsignedByteAdd();
					var14 = var3.readUnsignedByteSub() * 4;
					var16 = var3.readUnsignedShortAdd();
					var26 = var3.readUnsignedShort();
					var61 = var3.method9613();
					var6 = var3.method9653();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var59 = var3.readByteSub();
					var15 = var3.readUnsignedShortAdd();
					var9 = var58 + var7;
					var10 = var59 + var8;
					if (0 <= var7 && var7 < 104 && 0 <= var8 && var8 < 104 && 0 <= var9 && var9 < 104 && 0 <= var10 && var10 < 104 && var26 != 65535) {
						var7 = class378.method7167(var7);
						var8 = class378.method7167(var8);
						var9 = class378.method7167(var9);
						var10 = class378.method7167(var10);
						var19 = new Projectile(var26, class328.worldView.plane, var7, var8, class162.getTileHeight(class328.worldView, var7, var8, class328.worldView.plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var61, var14);
						var19.setDestination(var9, var10, class162.getTileHeight(class328.worldView, var9, var10, class328.worldView.plane) - var14, var15 + cycle);
						class328.worldView.projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field765 = false;
					field760 = false;
					class156.field1721 = var3.readUnsignedByte();
					class222.field2417 = var3.readUnsignedByte();
					Language.field4602 = var3.readUnsignedShort();
					NPCComposition.field2613 = var3.readUnsignedByte();
					Message.field461 = var3.readUnsignedByte();
					if (Message.field461 >= 100) {
						var20 = class378.method7167(class156.field1721);
						var5 = class378.method7167(class222.field2417);
						var6 = class162.getTileHeight(ConcurrentMidiTask.topLevelWorldView, var20, var5, ConcurrentMidiTask.topLevelWorldView.plane) - Language.field4602;
						var7 = var20 - class433.cameraX;
						var8 = var6 - RestClientThreadFactory.cameraY;
						var9 = var5 - WorldMapSection0.cameraZ;
						var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
						UserComparator6.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
						class264.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
						if (UserComparator6.cameraPitch < 128) {
							UserComparator6.cameraPitch = 128;
						}

						if (UserComparator6.cameraPitch > 383) {
							UserComparator6.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3422 == var1.serverPacket) {
					UrlRequester.method3003();
					var20 = var3.readInt();
					var5 = var3.readUnsignedByteNeg();
					var6 = var3.readUnsignedByteSub();
					experience[var5] = var20;
					currentLevels[var5] = var6;
					levels[var5] = 1;
					field647[var5] = var6;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var20 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					FriendsList.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					class499.field5058 = var3.readUnsignedByte();
					field582 = var3.readUnsignedByteSub();
					class167.field1798 = var3.readUnsignedByteSub();

					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						class322 var87 = IndexCheck.method5385()[var20];
						SoundSystem.method820(var87);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					InterfaceParent.forceDisconnect(var20);
					var1.serverPacket = null;
					return false;
				}

				String var51;
				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var24 = AbstractFont.escapeBrackets(Skeleton.method3886(BufferedNetSocket.method8811(var3)));
					class269.addGameMessage(6, var51, var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3390 == var1.serverPacket) {
					var20 = var3.readInt();
					var67 = var3.readUnsignedByteAdd() == 1;
					var21 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					var21.method7045(class253.localPlayer.appearance, var67);
					class416.invalidateWidget(var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3469 == var1.serverPacket) {
					SoundSystem.method820(class322.field3361);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var53 = new byte[var1.serverPacketLength];
					var3.method9581(var53, 0, var53.length);
					Buffer var84 = new Buffer(var53);
					var69 = var84.readStringCp1252NullTerminated();
					SequenceDefinition.openURL(var69, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					class277.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field503 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3471 == var1.serverPacket && isCameraLocked) {
					field765 = true;
					field760 = false;
					field759 = false;

					for (var20 = 0; var20 < 5; ++var20) {
						field764[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3424 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					this.method588(false);
					if (var20 == 0) {
						class354.entity = ConcurrentMidiTask.topLevelWorldView.players[var5];
					} else if (var20 == 1) {
						class354.entity = ConcurrentMidiTask.topLevelWorldView.npcs[var5];
					} else if (var20 == 2) {
						class354.entity = ConcurrentMidiTask.topLevelWorldView.worldEntities[var5];
						this.method588(true);
					}

					if (class354.entity == null) {
						class354.entity = class253.localPlayer;
					}

					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var23;
				if (ServerPacket.field3494 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readInt();
					var6 = var3.readUnsignedByteSub();
					var23 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var23 != null) {
						class59.closeInterface(var23, var20 != var23.group);
					}

					class418.openInterface(var5, var20, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3410 == var1.serverPacket) {
					ClientPreferences.field1299 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				long var27;
				long var29;
				long var31;
				long var34;
				String var36;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var27 = var3.readLong();
					var29 = (long)var3.readUnsignedShort();
					var31 = (long)var3.readMedium();
					PlayerType var92 = (PlayerType)class134.findEnumerated(class345.PlayerType_values(), var3.readUnsignedByte());
					var34 = var31 + (var29 << 32);
					boolean var64 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (var34 == crossWorldMessageIds[var15]) {
							var64 = true;
							break;
						}
					}

					if (var92.isUser && class277.friendSystem.isIgnored(new Username(var51, ObjectSound.loginType))) {
						var64 = true;
					}

					if (!var64 && field586 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var36 = AbstractFont.escapeBrackets(Skeleton.method3886(BufferedNetSocket.method8811(var3)));
						if (var92.modIcon != -1) {
							class535.addChatMessage(9, class152.method3376(var92.modIcon) + var51, var36, class265.base37DecodeLong(var27));
						} else {
							class535.addChatMessage(9, var51, var36, class265.base37DecodeLong(var27));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3423 == var1.serverPacket) {
					++serverCycle;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.readInt();
					var6 = var3.readUnsignedIntME();
					var76 = FloorUnderlayDefinition.widgetDefinition.method6544(var5);
					ItemComposition var75;
					if (!var76.isIf3) {
						if (var20 == -1) {
							var76.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var75 = Player.ItemDefinition_get(var20).getCountObj(var6);
						var76.modelType = 4;
						var76.modelId = var20;
						var76.modelAngleX = var75.xan2d;
						var76.modelAngleY = var75.yan2d;
						var76.modelZoom = var75.zoom2d * 100 / var6;
						class416.invalidateWidget(var76);
					} else {
						var76.itemId = var20;
						var76.itemQuantity = var6;
						var75 = Player.ItemDefinition_get(var20).getCountObj(var6);
						var76.modelAngleX = var75.xan2d;
						var76.modelAngleY = var75.yan2d;
						var76.modelAngleZ = var75.zan2d;
						var76.modelOffsetX = var75.offsetX2d;
						var76.modelOffsetY = var75.offsetY2d;
						var76.modelZoom = var75.zoom2d;
						if (var75.isStackable == 1) {
							var76.itemQuantityMode = 1;
						} else {
							var76.itemQuantityMode = 2;
						}

						if (var76.field3808 > 0) {
							var76.modelZoom = var76.modelZoom * 32 / var76.field3808;
						} else if (var76.rawWidth > 0) {
							var76.modelZoom = var76.modelZoom * 32 / var76.rawWidth;
						}

						class416.invalidateWidget(var76);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3440 == var1.serverPacket) {
					AuthenticationScheme.method3312();
					var66 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var66 >= 0) {
							currentClanSettings[var66] = null;
						} else {
							class363.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var66 >= 0) {
						currentClanSettings[var66] = new ClanSettings(var3);
					} else {
						class363.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						ObjectComposition.method5163(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3497 == var1.serverPacket) {
					return this.method1217(var1, 1);
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShort() * 30;
					field706 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3384 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					class140.method3255(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					class138.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3474 == var1.serverPacket) {
					field562 = cycleCntr;
					var66 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var66 >= 0) {
							currentClanChannels[var66] = null;
						} else {
							class47.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var66 >= 0) {
						currentClanChannels[var66] = new ClanChannel(var3);
					} else {
						class47.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var66 = var3.readByte();
					var24 = var3.readStringCp1252NullTerminated();
					long var37 = (long)var3.readUnsignedShort();
					long var39 = (long)var3.readMedium();
					PlayerType var96 = (PlayerType)class134.findEnumerated(class345.PlayerType_values(), var3.readUnsignedByte());
					long var42 = (var37 << 32) + var39;
					boolean var62 = false;
					ClanChannel var44 = null;
					var44 = var66 >= 0 ? currentClanChannels[var66] : class47.guestClanChannel;
					if (var44 == null) {
						var62 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var96.isUser && class277.friendSystem.isIgnored(new Username(var24, ObjectSound.loginType))) {
									var62 = true;
								}
								break;
							}

							if (var42 == crossWorldMessageIds[var15]) {
								var62 = true;
								break;
							}

							++var15;
						}
					}

					if (!var62) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var42;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var36 = AbstractFont.escapeBrackets(BufferedNetSocket.method8811(var3));
						var16 = var66 >= 0 ? 41 : 44;
						if (var96.modIcon != -1) {
							class535.addChatMessage(var16, class152.method3376(var96.modIcon) + var24, var36, var44.name);
						} else {
							class535.addChatMessage(var16, var24, var36, var44.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3435 == var1.serverPacket) {
					class167.field1798 = var3.readUnsignedByte();
					class499.field5058 = var3.readUnsignedByteSub();
					field582 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3516 == var1.serverPacket) {
					field633 = var3.readStringCp1252NullTerminated();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3461 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != revision) {
						revision = var20;
						ReflectionCheck.method676();
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var11;
				boolean var85;
				if (ServerPacket.field3458 == var1.serverPacket) {
					isCameraLocked = true;
					field765 = false;
					field759 = true;
					class166.field1793 = var3.readUnsignedByte();
					class329.field3545 = var3.readUnsignedByte();
					var20 = var3.readUnsignedShort();
					var5 = class378.method7167(var3.readUnsignedByte());
					var6 = class378.method7167(var3.readUnsignedByte());
					var7 = var3.readUnsignedShort();
					field514 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var9 = class378.method7167(class166.field1793);
					var10 = class378.method7167(class329.field3545);
					var11 = false;
					var85 = false;
					if (field514) {
						var61 = RestClientThreadFactory.cameraY;
						var26 = class162.getTileHeight(ConcurrentMidiTask.topLevelWorldView, var9, var10, ConcurrentMidiTask.topLevelWorldView.plane) - var20;
					} else {
						var61 = class162.getTileHeight(ConcurrentMidiTask.topLevelWorldView, class433.cameraX, WorldMapSection0.cameraZ, ConcurrentMidiTask.topLevelWorldView.plane) - RestClientThreadFactory.cameraY;
						var26 = var20;
					}

					field762 = new class509(class433.cameraX, WorldMapSection0.cameraZ, var61, var9, var10, var26, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					class271.method5434(var20);
					changedItemContainers[++field572 - 1 & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3513 == var1.serverPacket) {
					KeyHandler.field107 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				String var47;
				if (ServerPacket.field3387 == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var27 = (long)var3.readUnsignedShort();
					var29 = (long)var3.readMedium();
					PlayerType var25 = (PlayerType)class134.findEnumerated(class345.PlayerType_values(), var3.readUnsignedByte());
					long var45 = (var27 << 32) + var29;
					var85 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (var45 == crossWorldMessageIds[var13]) {
							var85 = true;
							break;
						}
					}

					if (class277.friendSystem.isIgnored(new Username(var51, ObjectSound.loginType))) {
						var85 = true;
					}

					if (!var85 && field586 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var45;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var47 = AbstractFont.escapeBrackets(Skeleton.method3886(BufferedNetSocket.method8811(var3)));
						byte var63;
						if (var25.isPrivileged) {
							var63 = 7;
						} else {
							var63 = 3;
						}

						if (var25.modIcon != -1) {
							class269.addGameMessage(var63, class152.method3376(var25.modIcon) + var51, var47);
						} else {
							class269.addGameMessage(var63, var51, var47);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3470 == var1.serverPacket) {
					Buddy.field4934 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					Occluder.updateNpcs(class328.worldView, false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3429 == var1.serverPacket) {
					UrlRequester.method3003();
					runEnergy = var3.readUnsignedShort();
					field706 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var86 = var3.readUnsignedByteAdd() == 1;
					var5 = var3.readUnsignedIntLE();
					var21 = FloorUnderlayDefinition.widgetDefinition.method6544(var5);
					if (var86 != var21.isHidden) {
						var21.isHidden = var86;
						class416.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					class422.playSong(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3480 == var1.serverPacket) {
					var20 = var3.method9694();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					class87.method2398(var5, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3488 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					var8 = var3.readUnsignedShortAdd();
					var9 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					ArrayList var95 = new ArrayList();
					var95.add(var20);
					var95.add(var5);
					class169.method3599(var95, var6, var7, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3400 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readSignedShort();
					var21 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					if (var5 != var21.sequenceId || var5 == -1) {
						var21.sequenceId = var5;
						var21.modelFrame = 0;
						var21.modelFrameCycle = 0;
						class416.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3438 == var1.serverPacket) {
					isCameraLocked = true;
					field765 = false;
					field760 = true;
					var20 = var3.readShort();
					var5 = var3.readShort();
					var6 = class223.method4708(var5 + UserComparator6.cameraPitch & 2027);
					var7 = var20 + class264.cameraYaw;
					var8 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field615 = new class511(UserComparator6.cameraPitch, var6, var8, var9);
					field517 = new class511(class264.cameraYaw, var7, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3502 == var1.serverPacket) {
					var20 = var3.readInt();
					var24 = var3.readStringCp1252NullTerminated();
					var21 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					if (!var24.equals(var21.text)) {
						var21.text = var24;
						class416.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShortLE();
					var6 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var8 = var5 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3);
					Widget var94 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					if (var9 != var94.color) {
						var94.color = var9;
						class416.invalidateWidget(var94);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var77;
				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var20 = var3.readInt();
					var77 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);

					for (var6 = 0; var6 < var77.itemIds.length; ++var6) {
						var77.itemIds[var6] = -1;
						var77.itemIds[var6] = 0;
					}

					class416.invalidateWidget(var77);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3498 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntIME();
					var21 = FloorUnderlayDefinition.widgetDefinition.method6544(var5);
					if (var21.modelType != 6 || var20 != var21.modelId) {
						var21.modelType = 6;
						var21.modelId = var20;
						class416.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3388 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortLE();
					WorldMapEvent.method6097(var20, var5, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3383 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedShortLE();
					var76 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					var76.field3854 = var5 + (var6 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3456 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					Login.performPlayerAnimation(class253.localPlayer, var5, var20);
					var1.serverPacket = null;
					return true;
				}

				Widget var22;
				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShortAddLE();
					var22 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					if (var7 != var22.modelAngleX || var5 != var22.modelAngleY || var6 != var22.modelZoom) {
						var22.modelAngleX = var7;
						var22.modelAngleY = var5;
						var22.modelZoom = var6;
						class416.invalidateWidget(var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					class499.field5058 = var3.readUnsignedByteAdd();
					class167.field1798 = var3.readUnsignedByteNeg();
					field582 = var3.readUnsignedByteSub();

					for (var20 = class167.field1798; var20 < class167.field1798 + 8; ++var20) {
						for (var5 = class499.field5058; var5 < class499.field5058 + 8; ++var5) {
							if (class328.worldView.groundItems[field582][var20][var5] != null) {
								class328.worldView.groundItems[field582][var20][var5] = null;
								HitSplatDefinition.updateItemPile(field582, var20, var5);
							}
						}
					}

					for (PendingSpawn var52 = (PendingSpawn)class328.worldView.pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)class328.worldView.pendingSpawns.previous()) {
						if (var52.x >= class167.field1798 && var52.x < class167.field1798 + 8 && var52.y >= class499.field5058 && var52.y < class499.field5058 + 8 && var52.plane == field582) {
							var52.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3427 == var1.serverPacket) {
					AuthenticationScheme.method3312();
					var66 = var3.readByte();
					class151 var82 = new class151(var3);
					ClanSettings var72;
					if (var66 >= 0) {
						var72 = currentClanSettings[var66];
					} else {
						var72 = class363.guestClanSettings;
					}

					if (var72 == null) {
						this.method1398(var66);
						var1.serverPacket = null;
						return true;
					}

					if (var82.field1687 > var72.field1734) {
						this.method1398(var66);
						var1.serverPacket = null;
						return true;
					}

					if (var82.field1687 < var72.field1734) {
						var1.serverPacket = null;
						return true;
					}

					var82.method3370(var72);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3415 == var1.serverPacket) {
					var86 = var3.readBoolean();
					if (var86) {
						if (class139.field1622 == null) {
							class139.field1622 = new class399();
						}
					} else {
						class139.field1622 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					class328.worldView.playerUpdateManager.method2866(var3, var1.serverPacketLength);
					class223.method4720();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var20] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false);
					}

					field751 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3491 == var1.serverPacket) {
					isCameraLocked = true;
					field765 = false;
					field759 = false;
					class166.field1793 = var3.readUnsignedByte();
					class329.field3545 = var3.readUnsignedByte();
					Renderable.field2086 = var3.readUnsignedShort();
					LoginState.field500 = var3.readUnsignedByte();
					FriendSystem.field827 = var3.readUnsignedByte();
					if (FriendSystem.field827 >= 100) {
						class433.cameraX = class378.method7167(class166.field1793);
						WorldMapSection0.cameraZ = class378.method7167(class329.field3545);
						RestClientThreadFactory.cameraY = class162.getTileHeight(ConcurrentMidiTask.topLevelWorldView, class433.cameraX, WorldMapSection0.cameraZ, ConcurrentMidiTask.topLevelWorldView.plane) - Renderable.field2086;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3407 == var1.serverPacket) {
					SoundSystem.method820(class322.field3364);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3462 == var1.serverPacket) {
					isCameraLocked = true;
					field765 = false;
					field760 = true;
					class156.field1721 = var3.readUnsignedByte();
					class222.field2417 = var3.readUnsignedByte();
					Language.field4602 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = class378.method7167(class156.field1721);
					var7 = class378.method7167(class222.field2417);
					var8 = class162.getTileHeight(ConcurrentMidiTask.topLevelWorldView, var6, var7, ConcurrentMidiTask.topLevelWorldView.plane) - Language.field4602;
					var9 = var6 - class433.cameraX;
					var10 = var8 - RestClientThreadFactory.cameraY;
					var61 = var7 - WorldMapSection0.cameraZ;
					double var93 = Math.sqrt((double)(var61 * var61 + var9 * var9));
					var14 = class223.method4708((int)(Math.atan2((double)var10, var93) * 325.9490051269531D) & 2047);
					var15 = GrandExchangeOffer.method7429((int)(Math.atan2((double)var9, (double)var61) * -325.9490051269531D) & 2047);
					field615 = new class511(UserComparator6.cameraPitch, var14, var20, var5);
					field517 = new class511(class264.cameraYaw, var15, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3401 == var1.serverPacket) {
					var20 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedIntME();
					short var56 = (short)var3.readShort();
					var7 = var3.readUnsignedShortAdd();
					var73 = class328.worldView.npcs[var7];
					if (var73 != null) {
						var73.method2751(var20, var5, var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3510 == var1.serverPacket) {
					SoundSystem.method820(class322.field3363);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var9 = var3.readUnsignedByteNeg();
					var10 = var9 >> 2;
					var61 = var9 & 3;
					var26 = field581[var10];
					var6 = var3.method9653();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var13 = var3.readUnsignedShortLE();
					if (0 <= var7 && var7 < 103 && 0 <= var8 && var8 < 103) {
						class218.method4619(var7, var8, var10, var61, var26, var13);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3428 == var1.serverPacket) {
					SoundSystem.method820(class322.field3369);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3404 == var1.serverPacket) {
					ClientPreferences.field1285 = var3.readUnsignedByte();
					class28.field132 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3484 == var1.serverPacket) {
					UrlRequester.method3003();
					weight = var3.readShort();
					field706 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					Object[] var78 = new Object[var51.length() + 1];

					for (var6 = var51.length() - 1; var6 >= 0; --var6) {
						if (var51.charAt(var6) == 's') {
							var78[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var78[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var78[0] = new Integer(var3.readInt());
					ScriptEvent var71 = new ScriptEvent();
					var71.args = var78;
					class421.runScriptEvent(var71);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var20 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedByte();
					var69 = var3.readStringCp1252NullTerminated();
					if (var20 >= 1 && var20 <= 8) {
						if (var69.equalsIgnoreCase("null")) {
							var69 = null;
						}

						playerMenuActions[var20 - 1] = var69;
						playerOptionsPriorities[var20 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var6 = class376.getGcDuration();
					PacketBufferNode var74 = class218.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var74.packetBuffer.writeIntME(var20);
					var74.packetBuffer.writeIntIME(var5);
					var74.packetBuffer.writeByte(GameEngine.fps);
					var74.packetBuffer.writeByte(var6);
					packetWriter.addNode(var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3479 == var1.serverPacket) {
					var6 = var3.method9639();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var18 = var3.readUnsignedByteAdd();
					var58 = var3.readByteNeg();
					var17 = var3.readUnsignedByteNeg();
					var13 = var3.readUnsignedByteAdd() * 4;
					var26 = var3.readUnsignedShortAddLE();
					var61 = var3.method9656();
					var59 = var3.readByteAdd();
					var15 = var3.readUnsignedShort();
					var16 = var3.readUnsignedShortAdd();
					var14 = var3.readUnsignedByteNeg() * 4;
					var9 = var58 + var7;
					var10 = var59 + var8;
					if (var7 >= 0 && var8 >= 0 && var7 < class328.worldView.sizeX && var8 < class328.worldView.sizeY && var9 >= 0 && var10 >= 0 && var9 < class328.worldView.sizeX && var10 < class328.worldView.sizeY && var26 != 65535) {
						var7 = class378.method7167(var7);
						var8 = class378.method7167(var8);
						var9 = class378.method7167(var9);
						var10 = class378.method7167(var10);
						var19 = new Projectile(var26, class328.worldView.plane, var7, var8, class162.getTileHeight(class328.worldView, var7, var8, class328.worldView.plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var61, var14);
						var19.setDestination(var9, var10, class162.getTileHeight(class328.worldView, var9, var10, class328.worldView.plane) - var14, var15 + cycle);
						class328.worldView.projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3395 == var1.serverPacket) {
					return this.method1723(var1);
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var66 = var3.readByte();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var66;
					if (Varps.Varps_main[var5] != var66) {
						Varps.Varps_main[var5] = var66;
					}

					class59.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var77 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					var77.modelType = 3;
					var77.modelId = class253.localPlayer.appearance.getChatHeadId();
					class416.invalidateWidget(var77);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3509 == var1.serverPacket) {
					class437.method8268(class328.worldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3433 == var1.serverPacket) {
					InvDefinition.method4768(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					class277.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					Decimator.FriendSystem_invalidateIgnoreds();
					field503 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3482 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field764[var20] = true;
					field508[var20] = var5;
					field768[var20] = var6;
					field769[var20] = var7;
					field770[var20] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3397 == var1.serverPacket) {
					SoundSystem.method820(class322.field3367);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3430 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedIntIME();
					var7 = var3.readUnsignedIntIME();

					for (var8 = var20; var8 <= var5; ++var8) {
						var31 = (long)var8 + ((long)var7 << 32);
						Node var33 = widgetFlags.get(var31);
						if (var33 != null) {
							var33.remove();
						}

						widgetFlags.put(new IntegerNode(var6), var31);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					Projectile.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVETO == var1.serverPacket) {
					isCameraLocked = true;
					field765 = false;
					field759 = true;
					class166.field1793 = var3.readUnsignedByte();
					class329.field3545 = var3.readUnsignedByte();
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field514 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var7 = class378.method7167(class166.field1793);
					var8 = class378.method7167(class329.field3545);
					boolean var55 = false;
					boolean var57 = false;
					if (field514) {
						var9 = RestClientThreadFactory.cameraY;
						var10 = class162.getTileHeight(ConcurrentMidiTask.topLevelWorldView, var7, var8, ConcurrentMidiTask.topLevelWorldView.plane) - var20;
					} else {
						var9 = class162.getTileHeight(ConcurrentMidiTask.topLevelWorldView, class433.cameraX, WorldMapSection0.cameraZ, ConcurrentMidiTask.topLevelWorldView.plane) - RestClientThreadFactory.cameraY;
						var10 = var20;
					}

					field762 = new class510(class433.cameraX, WorldMapSection0.cameraZ, var9, var7, var8, var10, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAddLE();
					var21 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					if (var21 != null && var21.type == 0) {
						if (var5 > var21.scrollHeight - var21.height) {
							var5 = var21.scrollHeight - var21.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var21.scrollY) {
							var21.scrollY = var5;
							class416.invalidateWidget(var21);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var50 = new World();
					var50.host = var3.readStringCp1252NullTerminated();
					var50.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var50.properties = var5;
					if (var50.isDeadman()) {
						var50.field810 = "beta";
						class380.field4407 = true;
					} else {
						class380.field4407 = false;
					}

					UserComparator3.updateGameState(45);
					var2.close();
					var2 = null;
					class132.changeWorld(var50);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3386 == var1.serverPacket) {
					SoundSystem.method820(class322.field3371);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					SpriteBufferProperties.privateChatMode = class541.method9525(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3481 == var1.serverPacket) {
					class277.friendSystem.method1932();
					field503 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3419 == var1.serverPacket) {
					var20 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1246(false);
						class499.method8953(rootInterface);
						class297.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var41;
					for (; var6-- > 0; var41.field1057 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var41 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var41 != null && var8 != var41.group) {
							class59.closeInterface(var41, true);
							var41 = null;
						}

						if (var41 == null) {
							var41 = class418.openInterface(var7, var8, var9);
						}
					}

					for (var23 = (InterfaceParent)interfaceParents.first(); var23 != null; var23 = (InterfaceParent)interfaceParents.next()) {
						if (var23.field1057) {
							var23.field1057 = false;
						} else {
							class59.closeInterface(var23, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var20) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();

						for (var61 = var8; var61 <= var9; ++var61) {
							var34 = ((long)var7 << 32) + (long)var61;
							widgetFlags.put(new IntegerNode(var10), var34);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var6 = var3.readInt();
					var7 = var3.readUnsignedByteAdd();
					var20 = var3.readUnsignedShortAdd();
					Player var70;
					if (var20 == localPlayerIndex) {
						var70 = class253.localPlayer;
					} else {
						var70 = class328.worldView.players[var20];
					}

					if (var70 != null) {
						var70.updateSpotAnimation(var7, var5, var6 >> 16, var6 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					Occluder.updateNpcs(class328.worldView, true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedIntLE();
					InterfaceParent var68 = (InterfaceParent)interfaceParents.get((long)var20);
					var23 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var23 != null) {
						class59.closeInterface(var23, var68 == null || var68.group != var23.group);
					}

					if (var68 != null) {
						var68.remove();
						interfaceParents.put(var68, (long)var5);
					}

					var22 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					if (var22 != null) {
						class416.invalidateWidget(var22);
					}

					var22 = FloorUnderlayDefinition.widgetDefinition.method6544(var5);
					if (var22 != null) {
						class416.invalidateWidget(var22);
						class165.revalidateWidgetScroll(FloorUnderlayDefinition.widgetDefinition.Widget_interfaceComponents[var22.id >>> 16], var22, true);
					}

					if (rootInterface != -1) {
						HealthBarUpdate.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3439 == var1.serverPacket) {
					var66 = var3.readByte();
					var27 = (long)var3.readUnsignedShort();
					var29 = (long)var3.readMedium();
					var31 = var29 + (var27 << 32);
					var11 = false;
					ClanChannel var12 = var66 >= 0 ? currentClanChannels[var66] : class47.guestClanChannel;
					if (var12 == null) {
						var11 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (crossWorldMessageIds[var13] == var31) {
								var11 = true;
								break;
							}
						}
					}

					if (!var11) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var31;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var47 = BufferedNetSocket.method8811(var3);
						var14 = var66 >= 0 ? 43 : 46;
						class535.addChatMessage(var14, "", var47, var12.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						HealthBarUpdate.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					var21 = FloorUnderlayDefinition.widgetDefinition.method6544(var20);
					if (var21.modelType != 1 || var5 != var21.modelId) {
						var21.modelType = 1;
						var21.modelId = var5;
						class416.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				Script.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1448 != null ? var1.field1448.id : -1) + "," + (var1.field1444 != null ? var1.field1444.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class138.logOut();
			} catch (IOException var48) {
				class275.method5488();
			} catch (Exception var49) {
				var24 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1448 != null ? var1.field1448.id : -1) + "," + (var1.field1444 != null ? var1.field1444.id : -1) + "," + var1.serverPacketLength + "," + (class253.localPlayer.pathX[0] + ConcurrentMidiTask.topLevelWorldView.baseX) + "," + (class253.localPlayer.pathY[0] + ConcurrentMidiTask.topLevelWorldView.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var24 = var24 + var3.array[var6] + ",";
				}

				Script.RunException_sendStackTrace(var24, var49);
				class138.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1921121933"
	)
	@Export("menu")
	final void menu() {
		class266.sortMenuEntries(menu);
		if (clickedWidget == null) {
			int var1 = MouseHandler.MouseHandler_lastButton;
			if (isMenuOpen) {
				if (var1 != 1 && (class429.mouseCam || var1 != 4) && !menu.method10256(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y)) {
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}

				if (var1 == 1 || !class429.mouseCam && var1 == 4) {
					menu.method10257(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}
			} else {
				int var2 = class147.method3334();
				if ((var1 == 1 || !class429.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
					var1 = 2;
				}

				if ((var1 == 1 || !class429.mouseCam && var1 == 4) && menu.menuOptionsCount > 0) {
					menu.method10255(var2);
				}

				if (var1 == 2 && menu.menuOptionsCount > 0) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1859174507"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = class147.method3334();
		return (leftClickOpensMenu && menu.menuOptionsCount > 2 || WorldMapLabelSize.method5530(var1)) && !menu.menuShiftClick[var1];
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1984150048"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		menu.method10252(var1, var2);
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		ConcurrentMidiTask.topLevelWorldView.scene.menuOpen(ConcurrentMidiTask.topLevelWorldView.plane, var1, var2, false);

		for (int var3 = 0; var3 < ConcurrentMidiTask.topLevelWorldView.worldEntityCount; ++var3) {
			WorldEntity var4 = ConcurrentMidiTask.topLevelWorldView.worldEntities[ConcurrentMidiTask.topLevelWorldView.worldEntityIndices[var3]];
			if (var4 != null) {
				var4.worldView.scene.menuOpen(var4.worldView.plane, var1, var2, false);
			}
		}

		isMenuOpen = true;
		menu.method10258();
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "38"
	)
	final void method1246(boolean var1) {
		ClanChannel.method3594(rootInterface, NPC.canvasWidth, ApproximateRouteStrategy.canvasHeight, var1);
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)V",
		garbageValue = "1131347809"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : FloorUnderlayDefinition.widgetDefinition.method6544(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = NPC.canvasWidth;
			var4 = ApproximateRouteStrategy.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		class299.alignWidgetSize(var1, var3, var4, false);
		KeyHandler.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	final void method1248() {
		class416.invalidateWidget(clickedWidget);
		++class535.widgetDragDuration;
		int var1;
		int var2;
		if (field604 && field683) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field661) {
				var1 = field661;
			}

			if (var1 + clickedWidget.width > field661 + clickedWidgetParent.width) {
				var1 = field661 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field766) {
				var2 = field766;
			}

			if (var2 + clickedWidget.height > field766 + clickedWidgetParent.height) {
				var2 = field766 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field635;
			int var4 = var2 - field688;
			int var5 = clickedWidget.dragZoneSize;
			if (class535.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field661 + clickedWidgetParent.scrollX;
			int var7 = var2 - field766 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class421.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						class421.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && class358.method6669(clickedWidget) != null) {
						PacketBufferNode var9 = class218.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
						var9.packetBuffer.writeIntME(draggedOnWidget.id);
						var9.packetBuffer.writeShortAdd(draggedOnWidget.childIndex);
						var9.packetBuffer.writeShort(draggedOnWidget.itemId);
						var9.packetBuffer.writeInt(clickedWidget.id);
						var9.packetBuffer.writeShort(clickedWidget.itemId);
						var9.packetBuffer.writeShortAddLE(clickedWidget.childIndex);
						packetWriter.addNode(var9);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field635 + widgetClickX, widgetClickY + field688);
				} else if (menu.menuOptionsCount > 0) {
					class47.method849(field635 + widgetClickX, field688 + widgetClickY);
				}

				clickedWidget = null;
			}

		} else {
			if (class535.widgetDragDuration > 1) {
				if (!isDraggingWidget && menu.menuOptionsCount > 0) {
					var1 = widgetClickX + field635;
					var2 = field688 + widgetClickY;
					class453.method8429(class7.tempMenuAction, var1, var2);
					class7.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "945769376"
	)
	@Export("username")
	public Username username() {
		return class253.localPlayer != null ? class253.localPlayer.username : null;
	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2101460894"
	)
	void method1250(int var1) {
		PacketBufferNode var2 = class218.getPacketBufferNode(ClientPacket.field3354, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-2"
	)
	void method1398(int var1) {
		PacketBufferNode var2 = class218.getPacketBufferNode(ClientPacket.field3303, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							RestClientThreadFactory.clientLanguage = Language.method7492(Integer.parseInt(var2));
							break;
						case 7:
							WorldMapData_0.field3013 = ScriptFrame.method1158(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							class433.field4740 = var2;
							break;
						case 10:
							ReflectionCheck.field228 = (StudioGame)class134.findEnumerated(RestClientThreadFactory.method189(), Integer.parseInt(var2));
							if (ReflectionCheck.field228 == StudioGame.oldscape) {
								ObjectSound.loginType = LoginType.oldscape;
							} else {
								ObjectSound.loginType = LoginType.field5257;
							}
							break;
						case 11:
							class246.authServiceBaseUrl = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 23:
						case 24:
						default:
							break;
						case 14:
							class318.field3253 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							JagexCache.field2360 = var2;
							break;
						case 21:
							field570 = Integer.parseInt(var2);
							break;
						case 22:
							class31.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var3 = var2.indexOf(".");
							if (var3 == -1) {
								class546.field5371 = Integer.parseInt(var2);
							} else {
								class546.field5371 = Integer.parseInt(var2.substring(0, var3));
								Integer.parseInt(var2.substring(var3 + 1));
							}
						}
					}
				}

				class387.method7243();
				class498.worldHost = this.getCodeBase().getHost();
				SecureRandomFuture.field980 = new JagNetThread();
				String var4 = WorldMapData_0.field3013.name;
				byte var5 = 0;
				if ((worldProperties & class543.field5344.rsOrdinal()) != 0) {
					CollisionMap.field2948 = "beta";
				}

				try {
					class91.method2431("oldschool", CollisionMap.field2948, var4, var5, 23);
				} catch (Exception var7) {
					Script.RunException_sendStackTrace((String)null, var7);
				}

				DynamicObject.client = this;
				RunException.field5551 = clientType;
				SecureUrlRequester.accessToken = System.getenv("JX_ACCESS_TOKEN");
				ApproximateRouteStrategy.refreshToken = System.getenv("JX_REFRESH_TOKEN");
				LoginState.sessionId = System.getenv("JX_SESSION_ID");
				HttpResponse.characterId = System.getenv("JX_CHARACTER_ID");
				class228.method4769(System.getenv("JX_DISPLAY_NAME"));
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field509 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field509 = 0;
					} else {
						field509 = 5;
					}
				}

				this.startThread(765, 503, 224, 1);
			}
		} catch (RuntimeException var8) {
			throw GraphicsObject.newRunException(var8, "client.init(" + ')');
		}
	}

	public void setClient(int var1) {
		this.clientId = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.refreshAccessTokenRequester = var1;
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			class532.updateLoginIndex(10);
		}
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	protected void finalize() throws Throwable {
		class332.field3569.remove(this);
		super.finalize();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1752574026"
	)
	@Export("updateLoginStatusUsernameRemembered")
	static void updateLoginStatusUsernameRemembered(boolean var0) {
		byte var1 = 0;
		if (!ArchiveLoader.method2376()) {
			var1 = 12;
		} else if (DynamicObject.client.containsAccessAndRefreshToken() || DynamicObject.client.otlTokenRequesterInitialized() || DynamicObject.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		class532.updateLoginIndex(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			FadeOutTask.otpMedium = 0;
			class135.otp = "";
		}

		class131.method3176();
		class33.focusPasswordWhenUsernameFilled();
	}
}
