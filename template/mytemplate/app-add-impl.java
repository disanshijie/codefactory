	/**
	 * ${remark}
	 */
	@Override
	public ReturnObject ${methodName}(<#list methodParams as mps>${mps[0]} ${mps[1]}<#if mps_has_next>, </#if></#list>) {
		ReturnObject obj = new ReturnObject(0, 0, "失败");
		try {
			int flag=${classNameLower}Service.${methodName}(<#list methodParams as mps>${mps[1]}<#if mps_has_next>, </#if></#list>);
			if(flag==1) {
				 obj = new ReturnObject(1, 0, "成功");
			}
		} catch (Exception e) {
			logger.error("${methodName}",e);
		}
		return obj;
	}
	