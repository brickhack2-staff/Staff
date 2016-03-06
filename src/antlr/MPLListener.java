// Generated from src\antlr\MPL.g4 by ANTLR 4.1

    package mpl.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MPLParser}.
 */
public interface MPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MPLParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(@NotNull MPLParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MPLParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(@NotNull MPLParser.NoteContext ctx);

	/**
	 * Enter a parse tree produced by {@link MPLParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull MPLParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MPLParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull MPLParser.GoalContext ctx);

	/**
	 * Enter a parse tree produced by {@link MPLParser#measure}.
	 * @param ctx the parse tree
	 */
	void enterMeasure(@NotNull MPLParser.MeasureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MPLParser#measure}.
	 * @param ctx the parse tree
	 */
	void exitMeasure(@NotNull MPLParser.MeasureContext ctx);

	/**
	 * Enter a parse tree produced by {@link MPLParser#notes}.
	 * @param ctx the parse tree
	 */
	void enterNotes(@NotNull MPLParser.NotesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MPLParser#notes}.
	 * @param ctx the parse tree
	 */
	void exitNotes(@NotNull MPLParser.NotesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MPLParser#attrVal}.
	 * @param ctx the parse tree
	 */
	void enterAttrVal(@NotNull MPLParser.AttrValContext ctx);
	/**
	 * Exit a parse tree produced by {@link MPLParser#attrVal}.
	 * @param ctx the parse tree
	 */
	void exitAttrVal(@NotNull MPLParser.AttrValContext ctx);

	/**
	 * Enter a parse tree produced by {@link MPLParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(@NotNull MPLParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MPLParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(@NotNull MPLParser.RepeatContext ctx);

	/**
	 * Enter a parse tree produced by {@link MPLParser#attrKey}.
	 * @param ctx the parse tree
	 */
	void enterAttrKey(@NotNull MPLParser.AttrKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MPLParser#attrKey}.
	 * @param ctx the parse tree
	 */
	void exitAttrKey(@NotNull MPLParser.AttrKeyContext ctx);

	/**
	 * Enter a parse tree produced by {@link MPLParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(@NotNull MPLParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MPLParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(@NotNull MPLParser.HeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link MPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull MPLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull MPLParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MPLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull MPLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MPLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull MPLParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MPLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull MPLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MPLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull MPLParser.BodyContext ctx);
}