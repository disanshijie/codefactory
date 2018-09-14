	/**
	 * ${remark}
	 */
	public String ${methodName}() {
		if(user!=null) {
			//TODO　限制只能是哪些　参数可用修改
			returnObj=${classNameLower}App.${methodName}(<#list methodParams as mps>${mps[1]}<#if mps_has_next>, </#if></#list>);
		}
		return SUCCESS;
	}
	